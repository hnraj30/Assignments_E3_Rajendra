package Locators_Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("input[name='field-keywords']")).sendKeys("DDR4 RAM");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
