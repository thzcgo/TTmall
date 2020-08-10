package com.thzc.ttmall.member.dao;

import com.thzc.ttmall.member.entity.UserAddressEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 收货地址表
 * 
 * @author thzc
 * @email 780417172@qq.com
 * @date 2020-08-10 14:03:58
 */
@Mapper
public interface UserAddressDao extends BaseMapper<UserAddressEntity> {
	
}
