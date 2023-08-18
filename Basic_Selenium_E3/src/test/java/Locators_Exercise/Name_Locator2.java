package Locators_Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Name_Locator2
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		System.out.println(driver.getCurrentUrl()+" page opened");
		driver.findElement(By.name("keyword")).sendKeys("Apple 14 pro");
		driver.findElement(By.name("keyword")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
