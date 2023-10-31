package WebElements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[3]/a"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele1)).click();

		
	}

}
