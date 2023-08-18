package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Xpath_Locator
{
	public static void main(String[]args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		//fetching address of email id text field using Xpath attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hnraaj30@gmail.com");
		Thread.sleep(2000);
		//fetching address of password text field using Xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("1234");
		Thread.sleep(2000);
		//fetching address of forgotten password link using Xpath contains text
		driver.findElement(By.xpath("//a[contains(text(),'pass')]")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}

	