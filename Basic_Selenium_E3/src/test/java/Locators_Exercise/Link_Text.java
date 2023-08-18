package Locators_Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Link_Text 
{
	public static void main(String[]args) throws Throwable
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Start here.")).click();
		driver.findElement(By.partialLinkText("Help")).click();

		
		
		
	}

}
