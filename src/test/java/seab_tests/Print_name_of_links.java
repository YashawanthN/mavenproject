package seab_tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestData.logins;

public class Print_name_of_links {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		logins login = new logins();
		
		driver.navigate().to(login.geturl());
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(login.getusername());
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(login.getpass());
		driver.findElement(By.cssSelector("button[value='login']")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
				System.out.println(links.size());
				for(WebElement lnk : links)
				{
					
					String text = lnk.getText();
					System.out.println(text);
				}

	}

}
