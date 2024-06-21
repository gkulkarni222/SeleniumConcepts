package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	@Test(timeOut=2,expectedExceptions=NumberFormatException.class)
	public void infiniteLoop() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String s="100A";
		Integer.parseInt(s);
		
		
	}
}
