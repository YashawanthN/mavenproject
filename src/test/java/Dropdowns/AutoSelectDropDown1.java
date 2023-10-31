package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSelectDropDown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);

		WebElement ele = driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
		ele.sendKeys("Benga");
		Thread.sleep(5000);
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);

	}

}
