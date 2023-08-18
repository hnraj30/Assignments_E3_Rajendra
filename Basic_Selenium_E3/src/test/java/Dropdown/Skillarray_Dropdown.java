package Dropdown;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Skillarray_Dropdown 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		
		//Fetching address of Dropdown
		WebElement dropDown=driver.findElement(By.xpath("//select[@name='cars']"));
		
		//Handling dropdown
		Select s = new Select(dropDown);
		System.out.println(s.isMultiple());
		System.out.println("-------------------------");
		
		s.selectByIndex(1);//
		Thread.sleep(2000);
		
		s.selectByValue("199");//
		Thread.sleep(2000);
		
		//s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");// selectByVisibleText is not working,BUG
		//Thread.sleep(2000);
		
		
		s.deselectByIndex(1);//
		Thread.sleep(2000);
		
		s.deselectByValue("199");//
		Thread.sleep(2000);
		
		//s.deselectByValue("INR 200 - INR 299 ( 3 ) ");// deSelectByVisibleText is not working,BUG
		//Thread.sleep(2000);
		
		//fetching values
		List <WebElement> values=s.getAllSelectedOptions();
		for(WebElement n:values)
		{
			System.out.println(n.getText());
		}
		
		Thread.sleep(200);
		driver.close();
		
		
		
	}
}
