package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {

		//chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Chromedriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		//validation
		String title=driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("Title matched");
		}else {
			System.out.println("Title mismatched");
		}

		
		
		driver.quit();
	}

}
