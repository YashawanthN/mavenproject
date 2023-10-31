package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DataProviderTest1
{
	@Test(dataProvider = "create",dataProviderClass = DataProviderFile.class)
	public void Test1(String username, String password) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		driver.close();
	}

	@Test(dataProvider = "create",dataProviderClass = DataProviderFile.class)
	public void Test2(String name, Number phone, String message)
	{
		System.out.println(name+ "========"+phone+"========"+message+ "=======");
	}
}
