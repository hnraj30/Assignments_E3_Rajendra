package Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;


public class Assignment_04
{
	public static void main(String [] args) throws Throwable
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data_Fb_Login.properties");
		p.load(fis);
		
		String Url= p.getProperty("url");
		String brow = p.getProperty("browser");
		WebDriver driver;
		if(brow.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(brow.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Url);
		Thread.sleep(2000);
		String Username = p.getProperty("username");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
		Thread.sleep(2000);
		String Password = p.getProperty("password");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Thread.sleep(3000);
		driver.close();
				
	}
}
