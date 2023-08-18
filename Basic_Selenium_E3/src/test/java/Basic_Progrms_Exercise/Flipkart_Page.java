package Basic_Progrms_Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_Page {

	public static void main(String[] args) throws Throwable 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//Maximize
		driver.manage().window().maximize();
		//Open flipkart page
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);

		//title
		System.out.println(driver.getTitle());
		//URL
		Thread.sleep(1000);

		System.out.println(driver.getCurrentUrl());
		//
		Thread.sleep(3000);
		//
		//close window
		driver.close();
		

	}

}
