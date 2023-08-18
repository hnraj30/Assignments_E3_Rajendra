package WebElements_Exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_Type 
{
	public static void main(String[]args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.Snapdeal.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
		if (searchBox.isDisplayed())
		{
			searchBox.sendKeys("Laptop");
			searchBox.sendKeys(Keys.ENTER);
			
		}
		else
		{
			System.out.println("Search box element not displayed in Snapdeal.com");
		}
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement radioButton= driver.findElement(By.xpath("//label[text()='Male']"));
		
		

		
		if (radioButton.isSelected())
		{
			System.out.println("Pass ");
		}
		else
		{
			System.out.println("Fail ");
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}
}

