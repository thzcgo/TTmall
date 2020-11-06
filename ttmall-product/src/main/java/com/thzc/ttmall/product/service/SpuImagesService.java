package com.thzc.ttmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.product.entity.SkuImagesEntity;
import com.thzc.ttmall.product.entity.SpuImagesEntity;

import java.util.List;
import java.util.Map;

/**
 * spuͼƬ
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-11 11:22:42
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveImages(Long id, List<String> images);


}

