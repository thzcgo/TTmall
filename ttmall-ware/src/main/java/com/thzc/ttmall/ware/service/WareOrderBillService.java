package com.thzc.ttmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.ware.entity.WareOrderBillEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:17:21
 */
public interface WareOrderBillService extends IService<WareOrderBillEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
