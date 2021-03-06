package com.thzc.ttmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.product.entity.SkuEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-11 11:22:43
 */
public interface SkuService extends IService<SkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

