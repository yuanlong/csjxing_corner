package com.doucome.corner.web.zhe.model;

import org.apache.commons.lang.StringUtils;

/**
 * JsonModel
 * @param <T>
 */
public class JsonModel<T> {
	public static final String CODE_SUCCESS = "success";
	public static final String CODE_FAIL = "fail";
	public static final String CODE_AUTH_FAIL = "auth_fail";
	public static final String CODE_FAIL_NO_DATA = "no_data";
	public static final String CODE_FAIL_UNEXPECTED = "unexpected";
	
	private String code;
	
	private String detail ;

	private T data;
	
	public boolean isSuccess(){
		return StringUtils.equals(code,CODE_SUCCESS) ; 
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	

}