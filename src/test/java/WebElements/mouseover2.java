package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}

}
