package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10)
	public void sum() {
		int i=20;
		int j=30;
		int k=i+j;
		System.out.println("sum is :: "+k);
	}
}
