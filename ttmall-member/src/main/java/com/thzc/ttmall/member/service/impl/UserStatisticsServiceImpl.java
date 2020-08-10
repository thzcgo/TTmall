package com.thzc.ttmall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.thzc.common.utils.PageUtils;
import com.thzc.common.utils.Query;

import com.thzc.ttmall.member.dao.UserStatisticsDao;
import com.thzc.ttmall.member.entity.UserStatisticsEntity;
import com.thzc.ttmall.member.service.UserStatisticsService;


@Service("userStatisticsService")
public class UserStatisticsServiceImpl extends ServiceImpl<UserStatisticsDao, UserStatisticsEntity> implements UserStatisticsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserStatisticsEntity> page = this.page(
                new Query<UserStatisticsEntity>().getPage(params),
                new QueryWrapper<UserStatisticsEntity>()
        );

        return new PageUtils(page);
    }

}