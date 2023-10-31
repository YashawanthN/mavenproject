package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseTest;


public class ReRun_FailedTest1 extends BaseTest
{
	@Test
	public static void launchapp()
	{
		driver.get("https://ebay.com");
			Assert.assertTrue(false);
	}
}
