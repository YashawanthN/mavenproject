package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.asx.com.au/markets/trade-our-cash-market/equity-market-prices");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
		ele.click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr"));
		System.out.println(rows.size());
		int rowSize = rows.size();
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr[1]/th"));
		System.out.println(columns.size());
		int colSize = columns.size();
		
		for(int i=1; i <=rowSize; i++)
		{
			
			for(int j=1; j<=colSize; j++)
			{
				
				/*WebElement tab = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[4]/div/div/section/div/div[1]/div/div[1]/table/tr/th"));
				System.out.print(tab.getText()+ "  ");*/
				
			}
		}
	}

}
