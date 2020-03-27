package com.yangxuefei.common.utils;

import java.util.Date;

/**
 * @ClassName: DateUtil 
 * @Description: ���ڴ�����
 * @author: MACHENIKE
 * @date: 2020��3��27�� ����8:56:33
 */
public class DateUtil {
	
	/**
	 * @Title: randomDate 
	 * @Description: �������һ����startDate��endDate֮����������
	 * @param startDate
	 * @param endDdate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate,Date endDdate) {
		long t1 = startDate.getTime();//��1970��startDate�ĺ�����
		long t2 = endDdate.getTime();//�ϴ�1970��endDate�ĺ�����
		if(t2<t1)
		throw new RuntimeException("��ʼ���ڲ��ܴ��ڽ�������");
		
		//�������һ����t1��t2֮��ĺ�����
		long t =(long) ((Math.random() * (t2-t1+1)) + t1);
		return new Date(t);
	}
	
}
