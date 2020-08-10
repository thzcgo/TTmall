package com.thzc.ttmall.order.dao;

import com.thzc.ttmall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:11:58
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
