package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_Division 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		//clicking date element
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		Thread.sleep(2000);
		//Selecting the date in Calendar
		driver.findElement(By.xpath("//div[text()='Aug']/../../..//span[text()='18']")).click();
		Thread.sleep(5000);

		driver.close();
	}
}
