package com.jianke.ssm.mapper;

import com.jianke.ssm.po.User;
import com.jianke.ssm.po.UserCustom;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	int updateByPrimaryKeyWithBLOBs(UserCustom record);
}