package WebElements;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import TestData.logins;
public class mouseover 
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
			logins log = new logins();
			driver.navigate().to(log.geturl());
			Thread.sleep(60000);
			driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(log.getusername());
			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(log.getpass());
			driver.findElement(By.cssSelector("button[value='login']")).click();
		
			
			Thread.sleep(60000);
			driver.findElement(By.xpath("//span[@class='fontSM'][normalize-space()='Moderation Service']")).click();
			Thread.sleep(60000);
			driver.findElement(By.xpath("//figcaption[contains(.,'CAF Report Repository')]")).click();
			Thread.sleep(60000);
			WebElement keys = driver.findElement(By.xpath("//input[@type = 'search']"));
			keys.sendKeys("6128");
			keys.sendKeys(Keys.ENTER);
			Thread.sleep(60000);
			driver.findElement(By.tagName("mat-icon")).click();
			Thread.sleep(60000);
			driver.findElement(By.xpath("//span[contains(.,'Dashboard')]")).click();
			Thread.sleep(60000);
			driver.findElement(By.className(".tailstatus.mb-2.ng-star-inserted.activeailstatus.mb-2.ng-star-inserted.activeailstatus mb-2 ng-star-inserted active")).click();
			Thread.sleep(60000);
			WebElement ele = driver.findElement(By.cssSelector("div[class = 'cursor-pointer'] canvas[title = 'LA' ]"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).perform();
			
		}

	}
	



