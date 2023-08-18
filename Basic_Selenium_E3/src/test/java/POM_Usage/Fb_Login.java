package POM_Usage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import POM.Fb_Loginpage;

public class Fb_Login
{
	
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		Fb_Loginpage login = new Fb_Loginpage(driver);
		login.emailTextField("Raj");
		login.passwordTextField("1234");
		login.loginButton();
	}

}

