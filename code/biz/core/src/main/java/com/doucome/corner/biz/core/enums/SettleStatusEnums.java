package com.doucome.corner.biz.core.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 结算状态ENUM
 * @author  2012-4-17
 *
 */
public enum SettleStatusEnums {
	
	/**
	 * 未结算
	 */
	UNSETTLE("U"),
	
	/**
	 * 结算中
	 */
	SETTLE_PENDING("P"),
	
	/**
	 * 集分宝结算中
	 */
	SETTLE_JFB_PENDING("JP") ,
	
	/**
	 *  取消，
	 */
	SETTLE_CANCEL("C"),
	
	/**
	 * 结算失败
	 */
	SETTLE_FAIL("F"), 
	
	/**
	 * 结算成功
	 */
	SETTLE_SUCCESS("S") ,
	
	/**
	 * 延迟结算
	 */
	DELAY_SETTLE("D") ,
	
	/**
	 * 退款维权充正
	 */
	SETTLE_REFUND_CHARGE("R") ,
	
	UNKNOWN("") ,
	;
	
	private SettleStatusEnums(String value) {
		this.value = value ;
	}
	
	private String value ;

	public String getValue() {
		return value;
	}

	public static SettleStatusEnums fromValue(String value){
		for(SettleStatusEnums e : SettleStatusEnums.values()){
			if(StringUtils.equals(e.getValue(), value)){
				return e;
			}
		}
		return UNKNOWN ;
	}
	
	
	
}
