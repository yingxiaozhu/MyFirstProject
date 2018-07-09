package com.cyj.MyFirstProject.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cyj.MyFirstProject.bean.model.LoginReqModel;
import com.cyj.MyFirstProject.bean.Token;
import com.cyj.MyFirstProject.bean.UserInfo;
import com.cyj.MyFirstProject.common.ResultEntity;
import com.cyj.MyFirstProject.constant.ResultCode;
import com.cyj.MyFirstProject.service.LoginService;
import com.cyj.MyFirstProject.util.Md5SaltUtil;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	
@Autowired
private LoginService loginService;


private static final String ACCOUNTISLOCKED="-1";

private static final Logger LOGGER = LogManager.getLogger(LoginController.class);

	/**
	 * 用户登录
	 */
	@PostMapping(value = "/mainLogin")
	@ResponseBody
	public ResultEntity<Token> mainLogin(LoginReqModel model,HttpServletRequest request, HttpServletResponse response)throws UnsupportedEncodingException, NoSuchAlgorithmException {
		   ResultEntity<Token> result = new ResultEntity<Token>();
		   result.setCode(ResultCode.FAIL);
		   try {
			    if(null == model.getAccount()) {
			    	 result.setCode(ResultCode.ACCOUNTISNOTEXISTENCE);
			    }else{
			    	  UserInfo userInfo = loginService.getUserInfoByAccount(model.getAccount());
			    	  
			    	  if(ACCOUNTISLOCKED.equals(String.valueOf(userInfo.getStatus()))) {
						   result.setCode(ResultCode.ACCOUNTISLOCKED);
					  }
			    	  
			    	  if (Md5SaltUtil.validPassword(model.getAccount() + model.getPassword() + userInfo.getSalt(), userInfo.getPassword())) {
			              result.setCode(ResultCode.SUCCESS);
			          }
			    }
			  
		   }catch(Exception e) {
			   LOGGER.info("登录异常");
		   }
		return result;

	}

}
