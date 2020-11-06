package com.thzc.ttmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.product.entity.SkuInfoEntity;
import com.thzc.ttmall.product.vo.SkuItemVo;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * sku
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-11 11:22:42
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuInfo(SkuInfoEntity skuInfoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);

    List<SkuInfoEntity> getSkuBySpuId(Long spuId);

    SkuItemVo item(Long skuId) throws ExecutionException, InterruptedException;
}

