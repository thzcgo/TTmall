package com.thzc.ttmall.product.service.impl;

import com.thzc.ttmall.product.dao.SpuDao;
import com.thzc.ttmall.product.entity.SpuEntity;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.thzc.common.utils.PageUtils;
import com.thzc.common.utils.Query;

import com.thzc.ttmall.product.service.SpuService;


@Service("spuService")
public class SpuServiceImpl extends ServiceImpl<SpuDao, SpuEntity> implements SpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuEntity> page = this.page(
                new Query<SpuEntity>().getPage(params),
                new QueryWrapper<SpuEntity>()
        );

        return new PageUtils(page);
    }

}