package com.thzc.ttmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.member.entity.UserEntity;

import java.util.Map;

/**
 * 用户表
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:03:58
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

