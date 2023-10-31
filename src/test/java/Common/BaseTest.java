package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver =null;
	@BeforeSuite
	public static void Launchbrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
}
