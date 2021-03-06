package com.doucome.corner.biz.core.qq;

import com.doucome.corner.biz.core.qq.model.QqCsecWordModel;
import com.doucome.corner.biz.core.qq.model.QqUserInfoModel;

/**
 * 类QqApiService.java的实现描述：调用qq相关api
 * 
 * @author ib 2012-7-28 下午04:43:29
 */
public interface QqQueryService {

    QqUserInfoModel queryUserInfo(String pf, String openId, String openKey);
    
    QqCsecWordModel csecWordFilter(String content , String pf, String openId, String openKey);
    /**
     * 是否是认证空间fans.
     * @param pf
     * @param openId
     * @param openKey
     * @return
     */
    boolean isQzoneFans(String pf, String openId, String openKey);
    
    /**
     * 判断是否微薄听众
     * @param openId
     * @param openKey
     * @return
     */
    boolean isWeiboFans(String pf,String openId , String openKey) ;
}
