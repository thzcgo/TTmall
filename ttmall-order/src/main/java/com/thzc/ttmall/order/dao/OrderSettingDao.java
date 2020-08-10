package com.thzc.ttmall.order.dao;

import com.thzc.ttmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:11:58
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
