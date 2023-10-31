package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDatafromXmlFile {
	@Parameters("browser")
	@Test
	public void login(String browser)
	{
		WebDriver driver;
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://google.com");
		}
		else if (browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
	}

}
