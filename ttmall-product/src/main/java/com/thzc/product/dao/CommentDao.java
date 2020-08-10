package com.thzc.product.dao;

import com.thzc.product.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-09 09:49:25
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
