package WebElements.Frames;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Dimension newSize = new Dimension(1400, 1200);
        //driver.manage().window().setSize(newSize);
		driver.navigate().to("https://demoqa.com/alerts");
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.SUBTRACT).keyUp(Keys.CONTROL).perform();
		//Click Button to see alert
		/*
		WebElement ele = driver.findElement(By.xpath("//button[@id='alertButton']"));
		ele.click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//On button click, alert will appear after 5 seconds
		
		WebElement ele1 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		ele1.click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//On button click, confirm box will appear
		
		WebElement ele2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ele2.click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		//Thread.sleep(2000);
		
		//On button click, prompt box will appear
		Actions act = new Actions(driver);
		WebElement ele3 = driver.findElement(By.xpath("//span[.='Browser Windows']"));
		Thread.sleep(2000);
		//act.moveToElement(ele3).perform();
		ele3.click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Yashawanth");
		driver.switchTo().alert().accept();*/
	}

}
