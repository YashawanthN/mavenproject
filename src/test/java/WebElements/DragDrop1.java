package WebElements;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragDrop1 
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://jqueryui.com/droppable/");
			
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
			Actions act = new Actions(driver);
			driver.switchTo().frame(ele);
			
			Thread.sleep(2000);
			WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
			WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
			
			act.dragAndDrop(drag, drop).perform();
			
			
		}

	}
