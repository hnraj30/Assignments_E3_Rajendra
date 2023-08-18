package Locators;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Group_Index_Locator
{
	public static void main(String[]args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		//fetching address of email id text field using Xpath attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Raj");
		Thread.sleep(2000);
	}
}   ////Incomplete

