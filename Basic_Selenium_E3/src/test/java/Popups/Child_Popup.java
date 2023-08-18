package Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Popup 
{
	public static void main(String[]args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.Skillrary.com");
		Thread.sleep(2000);
		//handling parent
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' ENGRANAJES ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='ignorelink'])[11]")).click();
		Thread.sleep(2000);
		//handling child window
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		Thread.sleep(2000);
		//Address of element in child window
		driver.findElement(By.id("mytext")).sendKeys("Hi..I'm Rajendra here");
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
