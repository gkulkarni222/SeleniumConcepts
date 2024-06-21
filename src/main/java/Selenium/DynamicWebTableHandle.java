package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Program Files\\\\Chromedriver\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//method 2
		
		driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='Contact id']")).click();
		
		
		
		
		
		
		
	}

}
