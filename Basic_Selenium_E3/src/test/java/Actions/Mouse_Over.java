package Actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
public class Mouse_Over 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement signIn=driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
				
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		
		driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
