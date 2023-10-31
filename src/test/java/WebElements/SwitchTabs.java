package WebElements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabs 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.salesforce.com/");
		Thread.sleep(2000);
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"1682326631687_yaw\"]/div[1]/article/div[2]/div/pbc-button[1]/a"));
		ele.click();
		Set <String> windowhandle = driver.getWindowHandles();
		Iterator<String> iterate =  windowhandle.iterator();
		String ParentIterator = iterate.next();
		String ChildIterator = iterate.next();
		driver.switchTo().window(ChildIterator);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Yashawanth");
		driver.findElement(By.name("UserLastName")).sendKeys("NS");
		
		driver.switchTo().window(ParentIterator);
	}

}
