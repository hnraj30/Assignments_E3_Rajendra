package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_02 
{
	public static void main(String[]args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		Point coordinates = ele.getLocation();
		System.out.println("X:"+coordinates.getX());
		System.out.println("Y:"+coordinates.getY());
		System.out.println("Attribute Value of 'class':"+ele.getAttribute("class"));
		System.out.println("Tag Name:"+ele.getTagName());
		Thread.sleep(2000);
		driver.close();
	}

}
