package com.doucome.corner.biz.core.sms.model;

import org.apache.commons.lang.StringUtils;

/**
 * ���� ҵ������ Enum

 * @author shenjia.caosj 
 * @date 2011-1-24 
 *
 */
public enum SmsBusinessEnums {

	
	
	/**
	 * ����۷��ֶ���
	 */
	DDZ_SETTLE_SMS("ddz_settle_sms","����۷��ֶ���") ,

	
	
	/**
	 * UNKNOW
	 */
	UNKNOW("unknow" , "UNKNOW") ,
	;
		
	public static SmsBusinessEnums toBusinessEnum(String smsBusinessId){
		SmsBusinessEnums[] smsBusinessEnums = SmsBusinessEnums.values() ;
		for(SmsBusinessEnums smsBusinessEnum : smsBusinessEnums){
			if(StringUtils.equals(smsBusinessEnum.getValue(), smsBusinessId)){
				return smsBusinessEnum ;
			}
		}
		return UNKNOW ;
	}
	
	private String value;
	
	private String description;
    
    private SmsBusinessEnums(String value , String description){
        this.value = value;
        this.description = description ;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public String getDescription(){
    	return this.description ;
    }
}