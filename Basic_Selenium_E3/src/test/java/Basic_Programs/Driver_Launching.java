package Basic_Programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Launching 
{
	public static void man(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	}

}
