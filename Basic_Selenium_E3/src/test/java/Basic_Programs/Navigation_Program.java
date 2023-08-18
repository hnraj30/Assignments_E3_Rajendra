package Basic_Programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Program {

	public static void main(String[] args) throws Throwable 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//navigation to another URL  statements
		driver.navigate().to("https://www.Amazon.in/");
		Thread.sleep(3000);
		//Navigation to back page
		driver.navigate().back();
		Thread.sleep(3000);
		//Navigation to forward page
		driver.navigate().forward();
		Thread.sleep(3000);		
		//refresh page
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Closing window
		driver.close();


		
		
		
		
		
		
		
	}

}
