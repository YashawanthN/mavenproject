package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseTest;

public class CaptureSceenshot_FailedTest extends BaseTest
{
	@Test
	public static void launchapp()
	{
		driver.get("https://ebay.com");
			Assert.assertTrue(false);
	}
}
