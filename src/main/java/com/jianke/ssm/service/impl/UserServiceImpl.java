package com.jianke.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jianke.ssm.mapper.UserMapper;
import com.jianke.ssm.mapper.UserMapperCustom;
import com.jianke.ssm.po.User;
import com.jianke.ssm.po.UserCustom;
import com.jianke.ssm.po.UserQueryVo;
import com.jianke.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapperCustom userMapperCustom;

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserCustom> findUserList(UserQueryVo userQueryVo)
			throws Exception {
		//閫氳繃ItemsMapperCustom鏌ヨ鏁版嵁搴�
		return userMapperCustom.findUserList(userQueryVo);
	}

	@Override
	public UserCustom findUserById(Integer id) throws Exception {
		
		User user = userMapper.selectByPrimaryKey(id);
		
		UserCustom userCustom = new UserCustom();
		
		BeanUtils.copyProperties(user, userCustom);
		
		return userCustom;
		
	}

	@Override
	public void updateUser(Integer id, UserCustom userCustom) throws Exception {
		userCustom.setId(id);
		userMapper.updateByPrimaryKeyWithBLOBs(userCustom);
	}	
	
}
