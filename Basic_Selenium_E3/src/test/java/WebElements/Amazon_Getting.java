package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Amazon_Getting
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println("Attribute: "+ mobile.getAttribute("class"));
		Point coOrdinates = mobile.getLocation();
		
		//Fetching Location
		System.out.println("X and Y are as follows");
		System.out.println("X: "+coOrdinates.getX());
		System.out.println("Y: "+coOrdinates.getY());
		
		//Fetching Dimensions
		Dimension size = mobile.getSize();
		System.out.println("Height and Width are as follows");
		System.out.println("Height: "+size.getHeight());
		System.out.println("Width: "+size.getWidth());
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
