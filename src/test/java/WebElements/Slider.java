package WebElements;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Slider 
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://jqueryui.com/slider/");
			
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
			Actions act = new Actions(driver);
			driver.switchTo().frame(ele);
			
			Thread.sleep(2000);
			WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
			act.dragAndDropBy(slider, 400, 400).perform();			
			
			Thread.sleep(2000);
			act.dragAndDropBy(slider, -200, 200).perform();	
		}

	}
