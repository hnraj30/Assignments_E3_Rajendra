package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider 
{
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object[][] a=new Object[3][2];
		a[0][0]="qqqqqqqqqq";
		a[0][1]="12345";
		
		a[1][0]="aaaaaaaaaa";
		a[1][1]="12345";
		
		a[2][0]="bbbbbbbbb";
		a[2][1]="12345";
		return a;
		
	}
	@Test()
	public void demo(String username, String pwd)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();

}
}
