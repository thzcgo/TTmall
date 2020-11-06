package com.thzc.ttmall.product.service.impl;

import com.thzc.ttmall.product.config.MyThreadConfig;
import com.thzc.ttmall.product.entity.SkuImagesEntity;
import com.thzc.ttmall.product.entity.SpuInfoDescEntity;
import com.thzc.ttmall.product.service.*;
import com.thzc.ttmall.product.vo.SkuItemSaleAttrVo;
import com.thzc.ttmall.product.vo.SkuItemVo;
import com.thzc.ttmall.product.vo.SpuItemAttrGroupVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.thzc.common.utils.PageUtils;
import com.thzc.common.utils.Query;

import com.thzc.ttmall.product.dao.SkuInfoDao;
import com.thzc.ttmall.product.entity.SkuInfoEntity;
import org.springframework.util.StringUtils;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                new QueryWrapper<SkuInfoEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void saveSkuInfo(SkuInfoEntity skuInfoEntity) {
        this.baseMapper.insert(skuInfoEntity);
    }

    @Override
    public PageUtils queryPageByCondition(Map<String, Object> params) {
        QueryWrapper<SkuInfoEntity> queryWrapper = new QueryWrapper<>();
        /**
         * key:
         * catelogId: 0
         * brandId: 0
         * min: 0
         * max: 0
         */
        String key = (String) params.get("key");
        if(!StringUtils.isEmpty(key)){
            queryWrapper.and((wrapper)->{
                wrapper.eq("sku_id",key).or().like("sku_name",key);
            });
        }

        String catelogId = (String) params.get("catelogId");
        if(!StringUtils.isEmpty(catelogId)&&!"0".equalsIgnoreCase(catelogId)){

            queryWrapper.eq("catalog_id",catelogId);
        }

        String brandId = (String) params.get("brandId");
        if(!StringUtils.isEmpty(brandId)&&!"0".equalsIgnoreCase(catelogId)){
            queryWrapper.eq("brand_id",brandId);
        }

        String min = (String) params.get("min");
        if(!StringUtils.isEmpty(min)){
            queryWrapper.ge("price",min);
        }

        String max = (String) params.get("max");

        if(!StringUtils.isEmpty(max)  ){
            try{
                BigDecimal bigDecimal = new BigDecimal(max);

                if(bigDecimal.compareTo(new BigDecimal("0"))==1){
                    queryWrapper.le("price",max);
                }
            }catch (Exception e){
            }
        }


        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public List<SkuInfoEntity> getSkuBySpuId(Long spuId) {

        List<SkuInfoEntity> list = this.list(new QueryWrapper<SkuInfoEntity>().eq("spu_id", spuId));
        return list;
    }

    @Autowired
    SpuInfoDescService spuInfoDescService;

    @Autowired
    SkuSaleAttrValueService skuSaleAttrValueService;

    @Autowired
    AttrGroupService attrGroupService;

    @Autowired
    SkuImagesService imagesService;

    @Autowired
    ThreadPoolExecutor executor;

    @Override
    public SkuItemVo item(Long skuId) throws ExecutionException, InterruptedException {
        SkuItemVo skuItemVo = new SkuItemVo();

        CompletableFuture<SkuInfoEntity> infoFuture = CompletableFuture.supplyAsync(() -> {
            //1. SKU基本信息获取，pms_sku_info
            SkuInfoEntity info = getById(skuId);
            skuItemVo.setInfo(info);
            return info;
        }, executor);

        CompletableFuture<Void> saleAttrFuture = infoFuture.thenAcceptAsync((res) -> {
            //3. 获取SPU销售属性组合 pms_product_attr_value
            List<SkuItemSaleAttrVo> skuItemSaleAttrVos = skuSaleAttrValueService.getSaleAttrsBySpuId(res.getSpuId());
            skuItemVo.setSaleAttr(skuItemSaleAttrVos);
        }, executor);

        CompletableFuture<Void> descFuture = infoFuture.thenAcceptAsync((res) -> {
            //4. 获取SPU的介绍 pms_spu_info_desc
            SpuInfoDescEntity spuInfoDescEntity = spuInfoDescService.getById(res.getSpuId());
            skuItemVo.setDesp(spuInfoDescEntity);
        }, executor);

        CompletableFuture<Void> baseAttrFuture = infoFuture.thenAcceptAsync((res) -> {
            //5. 获取SPU的规格参数信息
            List<SpuItemAttrGroupVo> attrGroupVos = attrGroupService.getAttrGroupWithAttrsBySpuId(res.getSpuId(), res.getCatalogId());
            skuItemVo.setGroupAttrs(attrGroupVos);
        }, executor);

        CompletableFuture<Void> imageFuture = CompletableFuture.runAsync(() -> {
            //2.SKU的图片信息获取，pms_sku_images
            List<SkuImagesEntity> images = imagesService.getImagesBySkuId(skuId);
            skuItemVo.setImages(images);
        }, executor);

        //等待所有任务都完成
        CompletableFuture.allOf(descFuture, baseAttrFuture, imageFuture).get();

//
//        //1. SKU基本信息获取，pms_sku_info
//        SkuInfoEntity info = getById(skuId);
//        skuItemVo.setInfo(info);
//        Long catalogId = info.getCatalogId();
//        Long spuId = info.getSpuId();
//
//
//        //2.SKU的图片信息获取，pms_sku_images
//        List<SkuImagesEntity> images = imagesService.getImagesBySkuId(skuId);
//        skuItemVo.setImages(images);
//
//        //3. 获取SPU销售属性组合 pms_product_attr_value
//        List<SkuItemSaleAttrVo> skuItemSaleAttrVos=skuSaleAttrValueService.getSaleAttrsBySpuId(spuId);
//        skuItemVo.setSaleAttr(skuItemSaleAttrVos);
//
//        //4. 获取SPU的介绍 pms_spu_info_desc
//        SpuInfoDescEntity spuInfoDescEntity = spuInfoDescService.getById(spuId);
//        skuItemVo.setDesp(spuInfoDescEntity);
//
//        //5. 获取SPU的规格参数信息
//        List<SpuItemAttrGroupVo> attrGroupVos = attrGroupService.getAttrGroupWithAttrsBySpuId(spuId, catalogId);
//        skuItemVo.setGroupAttrs(attrGroupVos);

        return skuItemVo;
    }
}