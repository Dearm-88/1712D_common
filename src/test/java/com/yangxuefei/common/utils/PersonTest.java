package com.yangxuefei.common.utils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		
		for (int i = 0; i < 10000; i++) {
			Person p = new Person();
			//����
			p.setName(StringUtil.generateChineseName());
			//����
			p.setAge(RandomUtil.random(1, 120));
			//����
			p.setAbout(StringUtil.randomChineseString(140));
			//ע������
			Calendar c = Calendar.getInstance();
			c.set(2010, 0, 1);
			Date date = DateUtil.randomDate(c.getTime(), new Date());
			p.setCreated(date);
			
			System.out.println(p);
		}
		
	}

}
