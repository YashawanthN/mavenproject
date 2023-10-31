package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	@Test
	public void GetTitle()
	{
		String ExpectedTitle= "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ebay.com/");
		
		SoftAssert Sftassert = new SoftAssert();
		String ActualTitle = driver.getTitle();
		Sftassert.assertEquals(ActualTitle,ExpectedTitle,"First Title Assettion Test Failed");
		
		
		String ExpectedText = "Search";
		String ActualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		Sftassert.assertEquals(ActualText, ExpectedText, "Second Text Assetion Test Failed");
		
		Sftassert.assertAll();
	}
}
