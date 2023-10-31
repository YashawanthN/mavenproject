package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Common.BaseTest;

public class CaptureScreenshot extends BaseTest
{
	public static void screenshot() throws IOException 
	{
		Date currentdate = new Date();
		currentdate.toString().replace(" ", "_").replace(":", "_");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date currentdate1 = new Date();
		String filename1 = currentdate1.toString().replace(" ", "_").replace(":", "_");
		FileUtils.copyFile(screenshotFile, new File(".//Screenshot//" + filename1 + ".png"));
	}
}
