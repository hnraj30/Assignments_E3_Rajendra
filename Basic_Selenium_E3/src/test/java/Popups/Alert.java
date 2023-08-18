package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		WebElement course = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(course).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Selenium Training'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Thread.sleep(3000);
		
		// shifting control to popup
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();		
		Thread.sleep(3000);
		driver.close();
		
	}
}
