package com.doucome.corner.biz.core.taobao.parser;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoResponse;

/**
 * TOP��Ӧ�������ӿڡ���Ӧ��ʽ������JSON, XML�ȵȡ�
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface TaobaoWidgetParser<T extends TaobaoResponse> {

	/**
	 * ����Ӧ�ַ������ͳ���Ӧ���������
	 * 
	 * @param rsp ��Ӧ�ַ���
	 * @return �������
	 */
	public T parse(String rsp) throws ApiException;

	/**
	 * ��ȡ��Ӧ�����͡�
	 */
	public Class<T> getResponseClass() throws ApiException;

}