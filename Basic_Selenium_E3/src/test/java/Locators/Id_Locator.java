package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Id_Locator
{
	public static void main(String[]args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Xiaomi");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		Thread.sleep(1000);
		driver.close();
		
	}

}
