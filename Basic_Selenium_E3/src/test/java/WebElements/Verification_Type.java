package WebElements;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Verification_Type 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		if (email.isDisplayed())
		{
			email.sendKeys("Raj");
			System.out.println("Values entered into email textfield successfully");
		}
		else
		{
			System.out.println("Email Textfield element is not displayed");
		}
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		if (button.isDisplayed())
		{
			button.click();
			System.out.println("Login button clicked succesfully");

		}
		else
		{
			System.out.println("Element(Button) is not displayed");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
