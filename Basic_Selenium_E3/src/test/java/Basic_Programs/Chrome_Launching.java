package Basic_Programs;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Launching 
{
	public static void main(String[]args)
	{
		//Manages the Chrome driver
		WebDriverManager.chromedriver().setup();
		
		//Opening chrome browser
		ChromeDriver driver=new ChromeDriver();
	}

}
