package com.thzc.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.product.entity.AttrGroupEntity;
import com.thzc.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性分组
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-09 09:49:26
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

