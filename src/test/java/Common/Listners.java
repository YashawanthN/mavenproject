package Common;

import org.testng.ITestListener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;
import utilities.CaptureScreenshot;

public class Listners extends CaptureScreenshot implements ITestListener {
	
	public void onTestStart(ITestContext result) {
		System.out.println("Test case starting");
	}

	public void onTestFailure(ITestResult result) {
		try {
			screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
