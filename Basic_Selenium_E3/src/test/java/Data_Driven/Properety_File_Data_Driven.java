package Data_Driven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;

public class Properety_File_Data_Driven
{
	public static void main(String[] args) throws Throwable 
	{
		//create an object for properties class
		Properties p = new Properties();
		
		//create an object for physical file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		// Loading fis
		p.load(fis);
		String Url = p.getProperty("url");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);
		String Username = p.getProperty("username");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
		
		String Password = p.getProperty("password");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Password);
		
		
	}

}
