package com.thzc.ttmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.ware.entity.WareEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:17:21
 */
public interface WareService extends IService<WareEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

