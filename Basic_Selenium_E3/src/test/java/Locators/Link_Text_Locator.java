package Locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Link_Text_Locator

{
	public static void main(String[]args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Rajendra");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		driver.close();


	}

}
