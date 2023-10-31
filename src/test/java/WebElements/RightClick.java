package WebElements;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class RightClick 
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://jqueryui.com/resizable/");
			
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
			Actions act = new Actions(driver);
			driver.switchTo().frame(ele);
			
			Thread.sleep(2000);
			WebElement rightClick = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
			act.contextClick(rightClick).perform();			
			
		}

	}
