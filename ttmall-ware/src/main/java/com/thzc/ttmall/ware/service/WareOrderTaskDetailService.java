package com.thzc.ttmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-19 12:36:53
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

