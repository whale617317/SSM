package com.jianke.ssm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jianke.ssm.po.User;
import com.jianke.ssm.po.UserCustom;
import com.jianke.ssm.po.UserQueryVo;

@Service
public interface UserService {
	public List<UserCustom> findUserList(UserQueryVo  userQueryVo) throws Exception;

	public UserCustom findUserById(Integer id) throws Exception;

	public void updateUser(Integer id, UserCustom userCustom)throws Exception;

	
}
