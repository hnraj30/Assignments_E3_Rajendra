package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Getting_Type 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		//email.sendKeys("Rajendra@xyz");
		Point coOrdinates = email.getLocation();
		//Fetching Location
		System.out.println("X and Y are as follows");
		System.out.println("X: "+coOrdinates.getX());
		System.out.println("Y: "+coOrdinates.getY());
		//Fetching Dimensions
		Dimension size = email.getSize();
		System.out.println("Height and Width are as follows");
		System.out.println("Height: "+size.getHeight());
		System.out.println("Width: "+size.getWidth());
		Thread.sleep(2000);
		driver.close();
	}
}

