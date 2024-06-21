package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoQAWebsite {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Chromedriver\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//static wait
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Tom");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Jerry");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("tomjerry@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		//mouse actions
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"))).click().build().perform();
		
		//Drag and drop
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']")));
		
		//upload a file
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\GAYATRI\\Downloads\\PD_Rahul.pdf");
		
		//dropdown
		Select select=new Select(driver.findElement(By.xpath("//div[@text='Select State']")));
		select.selectByVisibleText("Uttar Pradesh");
		
		
		
	
		

	}

}
