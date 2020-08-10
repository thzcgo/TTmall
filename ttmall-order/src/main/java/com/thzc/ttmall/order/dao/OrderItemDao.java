package com.thzc.ttmall.order.dao;

import com.thzc.ttmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:11:58
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
