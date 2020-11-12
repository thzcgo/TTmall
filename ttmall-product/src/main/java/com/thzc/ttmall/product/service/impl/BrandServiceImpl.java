package com.thzc.ttmall.product.service.impl;

import com.thzc.ttmall.product.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.thzc.common.utils.PageUtils;
import com.thzc.common.utils.Query;

import com.thzc.ttmall.product.dao.BrandDao;
import com.thzc.ttmall.product.entity.BrandEntity;
import com.thzc.ttmall.product.service.BrandService;
import org.springframework.util.StringUtils;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Autowired
    private CategoryBrandRelationService categoryBrandRelationService;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        String key = (String) params.get("key");
        QueryWrapper<BrandEntity> wrapper = new QueryWrapper<BrandEntity>();
        // 关键字不为空就连接上模糊查询条件
        if(!StringUtils.isEmpty(key)){
            // 相当于and (attr_group_id=key or attr_group_name like %key%)
            wrapper.and((obj)->{
                obj.eq("brand_id",key).or().like("name",key);
            });
        }
        IPage<BrandEntity> page = this.page(new Query<BrandEntity>().getPage(params),wrapper);
        return new PageUtils(page);
    }

    @Override
    public void updateByIdWithDetail(BrandEntity brand) {
        this.updateById(brand);
        if(!StringUtils.isEmpty(brand.getName())) {
            categoryBrandRelationService.updateBrand(brand.getBrandId(),brand.getName());
        }
    }

    @Override
    public List<BrandEntity> getBrandsByIds(List<Long> brandIds) {
        return baseMapper.selectList(new QueryWrapper<BrandEntity>().in("brandId", brandIds));
    }
}