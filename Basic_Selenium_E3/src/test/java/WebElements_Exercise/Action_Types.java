package WebElements_Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Action_Types {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		search.sendKeys("Iphone");
		Thread.sleep(2000);
		
		search.clear();
		Thread.sleep(2000);
		search.sendKeys("Mobile");
		Thread.sleep(2000);

		WebElement sButton= driver.findElement(By.xpath("//span[text()='Search']"));
		sButton.click();
		Thread.sleep(2000);

		driver.close();
		

	}

}
