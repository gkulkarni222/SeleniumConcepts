package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class ReadPropFile {

	 static WebDriver driver;
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		
		FileInputStream ip =new FileInputStream("C:\\Users\\GAYATRI\\eclipse-workspace\\DemoCreation\\src\\main\\java\\Selenium\\config.properties");

		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String BrowserName = prop.getProperty("Browser");
		System.out.println(BrowserName);
		
		String url=prop.getProperty("Url");
		System.out.println(url);
		
		if(BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver-win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "");
			//driver=new GeckoDriver();
		}
		
		driver.get(url);
	}

}
