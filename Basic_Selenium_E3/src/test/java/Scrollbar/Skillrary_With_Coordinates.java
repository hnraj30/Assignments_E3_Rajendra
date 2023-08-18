package Scrollbar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Skillrary_With_Coordinates 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		//Address of career
		WebElement career = driver.findElement(By.xpath("//a[text()='Career']"));
		Point location = career.getLocation();
		
		int x = location.getX();
		int y = location.getY();
		
		//Downcasting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")"); 		
		Thread.sleep(3000);
		
		//career.click();
		js.executeScript("arguments[0].click();", career);
		
		driver.close();
		
		
	}
}
