package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame
{
	public static void main(String []args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='login']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		//driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("userName")).sendKeys("hnraj30");
		driver.findElement(By.id("checkUser")).click();
		driver.switchTo().defaultContent();
		
		
		
	}

}
