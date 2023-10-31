package Dropdowns;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import TestData.logins;

public class Single_select {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		logins log = new logins();
		driver.navigate().to(log.geturl());
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(log.getusername());
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(log.getpass());
		driver.findElement(By.cssSelector("button[value='login']")).click();
		Thread.sleep(2000);;
		
		driver.findElement(By.xpath("//span[@class='fontSM'][normalize-space()='Moderation Service']")).click();
		driver.findElement(By.xpath("//figcaption[text()='Project Metadata']")).click();
		driver.findElement(By.xpath("//table//tr[2]//button")).click();
		driver.findElement(By.xpath("//span[text()='Configure']")).click();

	
		WebElement ele = driver.findElement(By.id("workType"));
		Select s = new Select(ele);
		
		List<WebElement> option = s.getOptions();
		int count = option.size();
		System.out.println(count);
		
		String target = "Coursework";
		for(WebElement we : option) 
		{
			if(we.getText().equals(target))
			{
			System.out.println("yes");	
			we.click();
			}
			
		}
	}

}
