package com.yangxuefei.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		//String str = null;//没值
		//String str = "";//没值
		//String str = " ";//有值
		String str = "abc";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		//String str = "abc";//有值
		String str = " ";//没值
		
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
