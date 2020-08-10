package com.thzc.ttmall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.thzc.common.utils.PageUtils;
import com.thzc.common.utils.Query;

import com.thzc.ttmall.coupon.dao.CouponSpuCategoryDao;
import com.thzc.ttmall.coupon.entity.CouponSpuCategoryEntity;
import com.thzc.ttmall.coupon.service.CouponSpuCategoryService;


@Service("couponSpuCategoryService")
public class CouponSpuCategoryServiceImpl extends ServiceImpl<CouponSpuCategoryDao, CouponSpuCategoryEntity> implements CouponSpuCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuCategoryEntity> page = this.page(
                new Query<CouponSpuCategoryEntity>().getPage(params),
                new QueryWrapper<CouponSpuCategoryEntity>()
        );

        return new PageUtils(page);
    }

}