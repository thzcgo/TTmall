package com.thzc.ttmall.product.dao;

import com.thzc.ttmall.product.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-11 11:22:43
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
