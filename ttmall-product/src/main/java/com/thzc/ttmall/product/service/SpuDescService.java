package com.thzc.ttmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.ttmall.product.entity.SpuDescEntity;
import com.thzc.common.utils.PageUtils;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-09 09:49:25
 */
public interface SpuDescService extends IService<SpuDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

