package com.thzc.ttmall.coupon.dao;

import com.thzc.ttmall.coupon.entity.CouponSpuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 10:45:15
 */
@Mapper
public interface CouponSpuDao extends BaseMapper<CouponSpuEntity> {
	
}
