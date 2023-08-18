package Basic_Programs;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebook_Page
{
	public static void main(String[] args) throws Throwable 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Entering the URl
		driver.get("https://www.facebook.com/");
		//Printing title
		System.out.println(driver.getTitle());
		//Printing the current URL
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		//closing window
		driver.close();

	}

}
