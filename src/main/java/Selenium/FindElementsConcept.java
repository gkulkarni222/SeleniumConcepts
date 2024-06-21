package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Chromedriver\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//get the count of links on the page
		//get the text of all the links
		
		List <WebElement> linklist=driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());
		
		for(int i=0;i<linklist.size();i++) {
		String linkText = linklist.get(i).getText();
		System.out.println(linkText);
		}
		
		
	}

}
