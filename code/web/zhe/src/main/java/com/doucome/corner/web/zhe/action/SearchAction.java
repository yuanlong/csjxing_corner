package com.doucome.corner.web.zhe.action;

import java.net.URLEncoder;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.util.UriTemplate;

import com.doucome.corner.biz.core.constant.Constant;
import com.doucome.corner.biz.core.model.URLModel;
import com.doucome.corner.biz.core.utils.HttpUrlHelper;
import com.doucome.corner.biz.core.utils.MD5Util;
import com.doucome.corner.biz.zhe.enums.SearchWayEnums;
import com.doucome.corner.web.common.action.BasicAction;
import com.doucome.corner.web.zhe.utils.TaobaoUrlUtils;

/**
 * ��ѯ���
 * @author shenjia.caosj 2012-4-1
 *
 */
@SuppressWarnings("serial")
public class SearchAction extends BasicAction  {

    private String	wd;
    
    private String mark;
    
    private String id ;

    /**
     * @see {@link UriTemplate}
     */
    @Override
    public String execute() throws Exception {
        if (StringUtils.isNotBlank(wd)) {
            URLModel model = HttpUrlHelper.parseURL(wd);
            if (model != null) { // taobao url
                id = TaobaoUrlUtils.parseItemId(model);
                return SearchWayEnums.ITEM.getValue();
            } else { // keywords
            	wd = URLEncoder.encode(wd, Constant.ENCODING) ;
            	String md5 = MD5Util.getMD5(wd);
            	mark = StringUtils.substring(md5, 26).toLowerCase();
                return SearchWayEnums.KEYWORD.getValue();
            }
        }
        return SearchWayEnums.KEYWORD.getValue();
    }


    /**
         * 
     * @return
     */

    public String getWd() {
        return wd;
    }

   
    public void setWd(String wd) {
        this.wd = wd;
    }
    

    
    public String getMark() {
        return mark;
    }


    
    public void setMark(String mark) {
        this.mark = mark;
    }


    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}