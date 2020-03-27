package com.yangxuefei.common.utils;

import java.util.Collection;

/**
 * @ClassName: CollectionUtil 
 * @Description: 集合的处理类
 * @author: MACHENIKE
 * @date: 2020年3月26日 下午6:55:47
 */
public class CollectionUtil {
	
	/**
	 * @Title: hasValue 
	 * @Description: 判断集合是否有值
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection==null || collection.isEmpty();
		//return collection==null || collection.size()>0;
	}
	
}
