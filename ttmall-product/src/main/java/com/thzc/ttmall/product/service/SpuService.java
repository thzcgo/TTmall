package com.thzc.ttmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.product.entity.SpuEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-09 09:49:26
 */
public interface SpuService extends IService<SpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

