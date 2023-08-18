package TestNg_Failing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Fb_Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Distributed
{
	@Test
	public void main() throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		Fb_Loginpage login = new Fb_Loginpage(driver);
		login.emailTextField("Raj");
		login.passwordTextField("1234");
		//login.loginButton();
		//driver.findElement(By.xpath(""));
		Thread.sleep(3000);
		driver.close();

	}
}

	
	
