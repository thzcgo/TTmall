package com.thzc.ttmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.ttmall.product.entity.SkuEntity;
import com.thzc.common.utils.PageUtils;

import java.util.Map;

/**
 * sku信息
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-09 09:49:25
 */
public interface SkuService extends IService<SkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

