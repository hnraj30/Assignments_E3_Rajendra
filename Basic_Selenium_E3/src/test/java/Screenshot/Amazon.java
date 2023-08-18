package Screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//Downcasting 
		TakesScreenshot ts = (TakesScreenshot) driver;
		//Access method
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Creating an object for physical file
		File dest = new File("./Screenshot/Amazon1.png");
		//File dest = new File("C:\\Users\\hnraj\\Desktop/Amazon.png");

		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);
		driver.close();
		}
	
}

