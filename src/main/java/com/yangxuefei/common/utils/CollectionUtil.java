package com.yangxuefei.common.utils;

import java.util.Collection;

/**
 * @ClassName: CollectionUtil 
 * @Description: ���ϵĴ�����
 * @author: MACHENIKE
 * @date: 2020��3��26�� ����6:55:47
 */
public class CollectionUtil {
	
	/**
	 * @Title: hasValue 
	 * @Description: �жϼ����Ƿ���ֵ
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection==null || collection.isEmpty();
		//return collection==null || collection.size()>0;
	}
	
}
