package com.experitest.auto;

import org.junit.Before;
import org.junit.Test;


public class IOSDemoTest extends BaseTest {

	@Before
	public void setUp() throws Exception{
		init("@os='ios'", "IOSDemoTest");
		client.install("cloud:com.google.android.calculator/com.android.calculator2.Calculator:8.3 (477856174)", false, false);
		client.launch("com.google.android.calculator/com.android.calculator2.Calculator", false, true);

		
	}
	
	@Test
	public void test(){
		
		client.click(in.Repo.zone("Calculater.digit_8"), in.Repo.element("Calculater.digit_8"), 0, 1);
		client.click(in.Repo.zone("operation.op_add"), in.Repo.element("operation.op_add"), 0, 1);
		client.click(in.Repo.zone("Calculater.digit_9"), in.Repo.element("Calculater.digit_9"), 0, 1);
		client.click(in.Repo.zone("operation.op_mul"), in.Repo.element("operation.op_mul"), 0, 1);
		
		
	}
	
	
}
