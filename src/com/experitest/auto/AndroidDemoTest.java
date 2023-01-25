package com.experitest.auto;

import org.junit.Before;
import org.junit.Test;


public class AndroidDemoTest extends BaseTest {

	@Before
	public void setUp() throws Exception{
		init("@os='android'", "AndroidDemoTest");
		client.install("cloud:com.google.android.calculator/com.android.calculator2.Calculator:8.3 (477856174)", false, false);
		client.launch("com.google.android.calculator/com.android.calculator2.Calculator", false, true);

	}
	
	@Test
	public void test(){
		
	}
	
	
}
