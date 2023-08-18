package Data_Driven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;

public class Property_Browser
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
		
		
		
		
	}
}
