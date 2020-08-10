package com.thzc.ttmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:11:58
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

