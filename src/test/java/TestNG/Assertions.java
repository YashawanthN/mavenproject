package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions 
{
	@Test
	public void GetTitle()
	{
		String ExpectedTitle= "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ebay.com/");
		
		String ActualDriver = driver.getTitle();
		Assert.assertEquals(ActualDriver,ExpectedTitle);
	}
}
