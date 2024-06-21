package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Chromedriver\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//xpath using contains
		driver.findElement(By.xpath("//input[contains(@class,'Hello')]"));
		
		//dynamic id 
		// id=123_test_t
		//id= test_234
		
		driver.findElement(By.xpath("//input[contains(@id,'test_t')]"));
		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]"));
		driver.findElement(By.xpath("//input[ends-with(@id,'test_t')]"));
		
		//custom xpath for links
		// All the links are represented by <a> tag
		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
	}

}
