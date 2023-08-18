package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Actions_Type 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//submit()
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Rajendra@xyz");
		driver.findElement(By.xpath("//button[@name='login']")).submit();
		
		//clear() 
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Mi 11x");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='field-keywords']")).clear();
		Thread.sleep(5000);
		driver.close();		
	}
	
}
