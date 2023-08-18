package WebElements_Exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_Type 
{
	public static void main(String[]args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.Snapdeal.com/");
		WebElement gc_element = driver.findElement(By.linkText("Gift Cards"));
		System.out.println("Text:" + gc_element.getText());
		System.out.println("Attribute:"+gc_element.getAttribute("class"));

		
		Point coOrdinates=gc_element.getLocation();
		System.out.println("Coordinates are as follows: \n"+"X: "+coOrdinates.getX()+"\n"+"Y: "+coOrdinates.getY());
		
		Dimension size=gc_element.getSize();
		System.out.println("Dimensions are as follows: \n"+"Height: "+size.getHeight()+"\n"+"Width: "+size.getWidth());
		Thread.sleep(2000);
		driver.close();
	}

}
