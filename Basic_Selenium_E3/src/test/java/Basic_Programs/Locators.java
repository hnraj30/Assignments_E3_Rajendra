package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				//Maximize the browser
				driver.manage().window().maximize();
				//Entering the URl
				driver.get("https:/www.Amazon.in/");
		

	}
}
