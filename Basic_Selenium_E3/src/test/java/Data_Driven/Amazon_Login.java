package Data_Driven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Login
{
	public static void main(String[] args) throws Throwable 
	{
		Properties p = new Properties();
		
		//create an object for physical file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		// Loading fis
		p.load(fis);
		String Url = p.getProperty("url1");
		
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
		
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		String Username = p.getProperty("username");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='continue']")).submit();
		String Password = p.getProperty("password");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		
		
		
	}
}