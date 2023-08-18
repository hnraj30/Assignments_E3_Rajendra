package Locators_Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath_Locators {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Iphone 14 pro");
		driver.findElement(By.xpath("//input[contains(@value,'Go')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.close();
		
		
		
	}

}
