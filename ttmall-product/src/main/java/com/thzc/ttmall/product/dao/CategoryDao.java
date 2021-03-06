package com.thzc.ttmall.product.dao;

import com.thzc.ttmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-11 11:22:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
