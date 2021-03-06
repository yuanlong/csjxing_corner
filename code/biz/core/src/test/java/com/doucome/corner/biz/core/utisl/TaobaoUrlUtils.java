package com.doucome.corner.biz.core.utisl;

import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.doucome.corner.biz.core.model.URLModel;
import com.doucome.corner.biz.core.utils.HttpUrlHelper;

public class TaobaoUrlUtils {
	
	public static String parseItemId(String itemUrl) {
		URLModel model = HttpUrlHelper.parseURL(itemUrl);
		if (model == null) {
			return null;
		}
		return parseItemId(model);
	}

	public static String parseItemId(URLModel model){
		if(model == null){
			return null ;
		}
		Map<String,String> params = model.getParams() ;
		if(params == null){
			return null ;
		}
		String itemId = params.get("id") ;
		if(StringUtils.isBlank(itemId)){
			itemId = params.get("item_id") ;
		}
		if(StringUtils.isBlank(itemId)){
			itemId = params.get("itemid") ;
		}
		if(StringUtils.isBlank(itemId)){
			itemId = params.get("itemId") ;
		}
		if(StringUtils.isBlank(itemId)){
			itemId = params.get("default_item_id") ;
		}
		if(StringUtils.isBlank(itemId)){
			itemId = params.get("mallstitemid") ;
		}
		if(StringUtils.isBlank(itemId)){
			itemId = params.get("mallstItemId") ;
		}
		if(StringUtils.isBlank(itemId)){
			return null ;
		}
		return itemId ;
	}
	
//	public static boolean isValidItemUrl(String tbItemUrl) {
//		if (StringUtils.isBlank(tbItemUrl)) {
//			return false;
//		}
//		if (StringUtils.isEmpty(parseItemId(tbItemUrl))) {
//			return false;
//		}		
//		return true;
//	}
}
