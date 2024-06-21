package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * 
 * 
 * setup system property for chrome
launch Browser
login to app
enter url
google title
logout from app
enter url
search test
logout from app
close browser
delete all cookies
 * 
 * 
 */
public class TestNGBasics {

	@BeforeSuite //1
	public void setUp() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("launch Browser");
	}
	
	@BeforeClass //3
	public void login() {
		System.out.println("login to app");
	}
	
	@BeforeMethod //4 //7
	public void enterUrl() {
		System.out.println("enter url");
	}
	
	/*
	 * 
	 *@BeforeMethod
	 *@test
	 *@AfterMethod
	 *
	 *@BeforeMethod
	 *@ test-2
	 *@AfterMethod
	 * 
	 * 
	 * 
	 * 
	 */
	@Test //5
	public void googleTitleTest() {
		System.out.println("google title");
	}
	
	@Test //8
	public void searchTest() {
		System.out.println("search test");
	}
	
	@AfterMethod //6 //9
	public void logOut() {
		System.out.println("logout from app");
	}
	
	@AfterTest //11
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}
	
	@AfterClass //10
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	@AfterSuite //12
	public void genreateReport() {
		System.out.println("genrate report");
	}
	
	
	
	
}
