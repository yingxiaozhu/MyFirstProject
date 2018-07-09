package com.cyj.MyFirstProject.constant;

public interface ResultCode {
	 /**
     * 成功
     */
    String SUCCESS = "00000";
    /**
     * 失败
     */
    String FAIL = "00001";
    /**
     * 账号不存在
     */
    String ACCOUNTISNOTEXISTENCE = "00010";
    
    /**
     * 账号已被锁
     */
    String ACCOUNTISLOCKED = "00011";
	

}
