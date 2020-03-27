package com.yangxuefei.common.utils;

import org.junit.Test;
import com.yangxuefei.common.utils.RandomUtil;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int i = RandomUtil.random(1,120);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 10, 3);
		for (int i : is) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char character = RandomUtil.randomCharacter();
		System.out.println(character);
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(6);
		System.out.println(string);
	}

}
