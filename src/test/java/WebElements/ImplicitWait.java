package WebElements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[2]/a")).click();
	}

}
