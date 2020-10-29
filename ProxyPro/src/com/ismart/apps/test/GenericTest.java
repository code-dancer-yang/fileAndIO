package com.ismart.apps.test;

import org.junit.Test;

import com.ismart.apps.generic.GenericClas;

public class GenericTest {
	@Test
	public void testGenericCls() {
		GenericClas<String> genCls=new GenericClas<String>();
		genCls.setT("hello GenericCls");
		System.out.println(genCls.getT());
	}

}
