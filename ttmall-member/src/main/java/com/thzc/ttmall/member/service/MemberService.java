package com.thzc.ttmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.thzc.common.utils.PageUtils;
import com.thzc.ttmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-17 21:08:05
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

