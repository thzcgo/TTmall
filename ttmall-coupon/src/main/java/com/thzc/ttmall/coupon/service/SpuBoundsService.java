package com.thzc.ttmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.to.SpuBoundTo;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-18 11:18:41
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);


}

