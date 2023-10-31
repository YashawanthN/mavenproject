package seab_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestData.logins;

public class test2 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		logins u = new logins();
		
		driver.navigate().to(u.geturl());
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(u.getusername());
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(u.getpass());
		driver.findElement(By.cssSelector("button[value='login']")).click();
		
	}

}
