package com.doucome.corner.web.zhe.authz.model;

import org.apache.commons.lang.StringUtils;

import com.doucome.corner.biz.core.utils.JacksonHelper;
import com.doucome.corner.biz.core.utils.MD5Util;

/**
 * 类DdzAuthzTemp.java的实现描述：登录信息
 * 
 * @author ib 2012-4-1 上午12:06:25
 */
public class DdzAuthzTemp {

    private String uid;

    private String password;
    
    /**
     * 支付宝登陆的分配ID
     */
    private String nativeAlipayId ;

    private long   loginTime;

    private String signature;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(long loginTime) {
        this.loginTime = loginTime;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void generateSignature() {
        this.signature = createSignature();
    }
    
    public String getNativeAlipayId() {
		return nativeAlipayId;
	}

	public void setNativeAlipayId(String nativeAlipayId) {
		this.nativeAlipayId = nativeAlipayId;
	}

    private String createSignature() {
        StringBuilder builder = new StringBuilder();
        builder.append(uid);
        builder.append('|');
        builder.append(password);
        builder.append('|');
        builder.append(loginTime);
        return MD5Util.getMD5(builder.toString());
    }


	public boolean checkSignature() {
        return StringUtils.equals(signature, createSignature());
    }

    public String toString() {
        return JacksonHelper.toJSON(this);
    }
}
