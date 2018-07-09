package com.cyj.MyFirstProject.mapper;

import com.cyj.MyFirstProject.bean.UserInfo;

public interface LoginMapper {
	
	UserInfo getUserInfoByAccount(String account);
	

}
