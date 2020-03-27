package com.yangxuefei.common.utils;

import java.util.Date;

/**
 * @ClassName: DateUtil 
 * @Description: 日期处理类
 * @author: MACHENIKE
 * @date: 2020年3月27日 上午8:56:33
 */
public class DateUtil {
	
	/**
	 * @Title: randomDate 
	 * @Description: 随机产生一个在startDate和endDate之间的随机日期
	 * @param startDate
	 * @param endDdate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate,Date endDdate) {
		long t1 = startDate.getTime();//从1970到startDate的毫秒数
		long t2 = endDdate.getTime();//聪聪1970到endDate的毫秒数
		if(t2<t1)
		throw new RuntimeException("开始日期不能大于结束日期");
		
		//随机产生一个在t1和t2之间的毫秒数
		long t =(long) ((Math.random() * (t2-t1+1)) + t1);
		return new Date(t);
	}
	
}
