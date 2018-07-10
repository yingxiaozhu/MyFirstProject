package com.cyj.MyFirstProject.bean;

import java.util.Date;

public class UserInfo {
	
	private long id;
	
	private String account;
	
	private String username;
	
	private transient String password;
	
    private String telephone;
    
	private String email;
	
	private int status;
	
	private Date createTime;
	
	private long loginUsreId;
	
	private transient String salt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public long getLoginUsreId() {
		return loginUsreId;
	}

	public void setLoginUsreId(long loginUsreId) {
		this.loginUsreId = loginUsreId;
	}

}
