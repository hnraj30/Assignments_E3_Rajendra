package Locators_Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class All_link_texts_in_page {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement alllinks:links)
		{
			System.out.print(alllinks.getText()+"     ");
			
		}
		Thread.sleep(1000);
		driver.close();
		
		
		

	}

}
