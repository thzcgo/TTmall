package com.thzc.ttmall.member.dao;

import com.thzc.ttmall.member.entity.UserStatisticsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 统计信息表
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:03:59
 */
@Mapper
public interface UserStatisticsDao extends BaseMapper<UserStatisticsEntity> {
	
}
