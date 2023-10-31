package WebElements;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserZoom {

	public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//Dimension newSize = new Dimension(1400, 1200);
	        //driver.manage().window().setSize(newSize);
			driver.navigate().to("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
			/*Actions act = new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys(Keys.SUBTRACT).keyUp(Keys.CONTROL).perform();*/
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.body.style.zoom='0.7'");
			
		}

	}


