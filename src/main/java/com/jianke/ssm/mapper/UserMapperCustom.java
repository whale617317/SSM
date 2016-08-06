package com.jianke.ssm.mapper;

import java.util.List;
import com.jianke.ssm.po.UserCustom;
import com.jianke.ssm.po.UserQueryVo;



public interface UserMapperCustom {
	    //商品查询列表
		public List<UserCustom> findUserList(UserQueryVo userQueryVo)throws Exception;
	}

