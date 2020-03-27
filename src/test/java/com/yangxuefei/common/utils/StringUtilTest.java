package com.yangxuefei.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		//String str = null;//ûֵ
		//String str = "";//ûֵ
		//String str = " ";//��ֵ
		String str = "abc";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		//String str = "abc";//��ֵ
		String str = " ";//ûֵ
		
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		//String string = StringUtil.randomChineseString();
		String string = StringUtil.randomChineseString(500);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}

}