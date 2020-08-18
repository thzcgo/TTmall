package com.thzc.ttmall.member.dao;

import com.thzc.ttmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-17 21:08:05
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
