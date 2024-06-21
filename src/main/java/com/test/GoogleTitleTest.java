package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Chromedriver\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.google.com");

	}
	@Test()
	public void googleTitleTest() {
		String s = driver.getTitle();
		System.out.println(s);
		Assert.assertEquals(s, "Google");
		
	}
	
	@Test()
	public void IsmailPresent() {
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertTrue(b, "mail is not present");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
