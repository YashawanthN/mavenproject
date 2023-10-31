package WebElements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait {

	
	public FluentWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[3]/a"));
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(ele1)).click();

		
	}

}
