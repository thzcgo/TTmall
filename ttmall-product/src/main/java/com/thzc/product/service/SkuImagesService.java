package com.thzc.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.product.entity.SkuImagesEntity;
import com.thzc.common.utils.PageUtils;

import java.util.Map;

/**
 * sku图片
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-09 09:49:25
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

