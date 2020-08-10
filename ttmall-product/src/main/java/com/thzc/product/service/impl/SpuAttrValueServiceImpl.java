package com.thzc.product.service.impl;

import com.thzc.common.utils.Query;
import com.thzc.product.dao.SpuAttrValueDao;
import com.thzc.product.entity.SpuAttrValueEntity;
import com.thzc.product.service.SpuAttrValueService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.thzc.common.utils.PageUtils;


@Service("spuAttrValueService")
public class SpuAttrValueServiceImpl extends ServiceImpl<SpuAttrValueDao, SpuAttrValueEntity> implements SpuAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuAttrValueEntity> page = this.page(
                new Query<SpuAttrValueEntity>().getPage(params),
                new QueryWrapper<SpuAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}