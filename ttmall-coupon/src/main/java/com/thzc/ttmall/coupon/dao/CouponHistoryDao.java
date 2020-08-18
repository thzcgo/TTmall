package com.thzc.ttmall.coupon.dao;

import com.thzc.ttmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-18 11:18:41
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
