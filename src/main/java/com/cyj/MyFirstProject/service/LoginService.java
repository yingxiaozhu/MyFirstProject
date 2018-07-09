package com.cyj.MyFirstProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cyj.MyFirstProject.bean.UserInfo;
import com.cyj.MyFirstProject.mapper.LoginMapper;


@Service
@EnableTransactionManagement
public class LoginService {
	
	@Autowired
	private LoginMapper loginMapper;
	
	public UserInfo getUserInfoByAccount(String account) {
		
		System.out.println("---1111testsql:testsql:testsql:testsql:testsql:--");
		System.out.println(loginMapper.getUserInfoByAccount(account));
		System.out.println("---222testsql:testsql:testsql:testsql:testsql:--");
		return loginMapper.getUserInfoByAccount(account);
		
	}

}
