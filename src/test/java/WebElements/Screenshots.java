package WebElements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Date currentdate = new Date();
		currentdate.toString().replace(" ", "_").replace(":", "_");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ebay.com.au/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date currentdate1 = new Date();
		String filename1 = currentdate1.toString().replace(" ", "_").replace(":", "_");
		FileUtils.copyFile(screenshotFile, new File(".//Screenshot//"+filename1+".png"));
		
		
		
		}
	}


