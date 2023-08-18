package Dropdown;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Amazon_Dropdown 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.Amazon.in/");
		
		//Fetching address of Dropdown
		WebElement dropDown=driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		
		//Handling dropdown
		Select s = new Select(dropDown);
		
		System.out.println(s.isMultiple());
		System.out.println("-------------------------");
		
		s.selectByIndex(8);//baby
		Thread.sleep(2000);
		
		s.selectByValue("search-alias=fashion");//Amazon fashion
		Thread.sleep(2000);
		
		s.selectByVisibleText("Appliances");// Appliance
		Thread.sleep(2000);
		
		
		//fetching values
		List <WebElement> values=s.getOptions();
		for(WebElement n:values)
		{
			System.out.println(n.getText());
		}
		driver.close();
		
	}
}
