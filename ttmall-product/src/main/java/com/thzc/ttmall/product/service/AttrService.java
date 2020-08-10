package com.thzc.ttmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.ttmall.product.entity.AttrEntity;
import com.thzc.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品属性
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-09 09:49:26
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

