package Locators_Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Traverse {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mi 11x");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Mi 11X Cosmic Black 6GB RAM 128GB ROM Storage 5G | SD 870 | DisplayMate A+ rated 120Hz E4 AMOLED | 48MP Sony sensor')]/../../../../../../../../../../../..//span[@class='a-price-whole']")).getText());
		Thread.sleep(2000);
		driver.close();
	}

}
