package com.test;

import org.testng.annotations.Test;

public class TestingFeature {

	@Test
	public void loginTest() {
		System.out.println("login test");
		
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void logoTest() {
		System.out.println("Logo test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("search test");
	}
}
