package com.thzc.ttmall.product.dao;

import com.thzc.ttmall.product.entity.CategoryBrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-09 09:49:25
 */
@Mapper
public interface CategoryBrandDao extends BaseMapper<CategoryBrandEntity> {
	
}
