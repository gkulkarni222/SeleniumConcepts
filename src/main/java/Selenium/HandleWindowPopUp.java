package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) {
		
		//1. alerts (javascripts pop up) - alert API - accept,dismiss
		//2. File upload popup -- browse button(type=file, sendkeys method)
		//3. Window handle popup -- Advertisement popup (windowhandler API,  GetWindowHanles()) 
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Chromedriver\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.poptin.com/");
		
		driver.findElement(By.linkText("Create Your Free Poptin")).click();
		
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> it =handler.iterator();
		
		String parentWindowId= it.next();
		System.out.println("Parent window id is:" + parentWindowId);
		
		String childWindowId =it.next();
		System.out.println("Child window id is:"+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
