package WebElements.Radio_buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioTest1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		Actions acts = new Actions(driver);
		Thread.sleep(2000);
		acts.moveToElement(ele).perform();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.id("redeemFlights"));
		
	if(ele1.isSelected())
		{
			System.out.println("Radio button is selected");
			
		}else
		{
			System.out.println("Radio button is Not selected");
			ele1.click();
		}

	}

}
