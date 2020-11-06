package com.thzc.ttmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.product.entity.SkuImagesEntity;

import java.util.List;
import java.util.Map;

/**
 * skuͼƬ
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-11 11:22:42
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<SkuImagesEntity> getImagesBySkuId(Long skuId);
}

