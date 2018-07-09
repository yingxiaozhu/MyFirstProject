package com.cyj.MyFirstProject.common;

public class ResultEntity<T> {
	private String code;
	
	private T value;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	

}
