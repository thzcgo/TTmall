package com.thzc.ttmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.ttmall.product.entity.BrandEntity;
import com.thzc.common.utils.PageUtils;

import java.util.Map;

/**
 * 品牌
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-09 09:49:26
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

