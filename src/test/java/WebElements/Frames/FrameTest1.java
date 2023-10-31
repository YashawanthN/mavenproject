package WebElements.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		WebElement ele = driver.findElement(By.id("sampleHeading"));
		String OldText = "This is a sample page";
		String NewText = ele.getText();
		if(NewText.contains(OldText))
		{
			System.out.println(" Test Pass");
		}
		
	}

}
