package com.thzc.ttmall.product.vo;

import com.thzc.ttmall.product.entity.SkuImagesEntity;
import com.thzc.ttmall.product.entity.SkuInfoEntity;
import com.thzc.ttmall.product.entity.SpuInfoDescEntity;
import lombok.Data;

import java.util.List;

@Data
public class SkuItemVo {

    /**
     * spu基本信息
     */
    SkuInfoEntity info;

    /**
     * sku的图片信息
     */
    List<SkuImagesEntity> images;

    /**
     * spu的销售属性组合
     */
    List<SkuItemSaleAttrVo> saleAttr;

    /**
     * spu的介绍
     */
    SpuInfoDescEntity desp;

    /**
     * spu的规格参数信息
     */
    List<SpuItemAttrGroupVo> groupAttrs;
}
