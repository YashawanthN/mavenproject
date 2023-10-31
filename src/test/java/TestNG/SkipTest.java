package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
	
	
	Boolean datasetup = true;
	@Test(enabled = false)
	public void skipTest1()
	{
	System.out.println("Skipt the test by using TestNG anotation Attribute ");
	}
	@Test
	public void skipTest2()
	{
	System.out.println("Skipt the test by throwing Skip Exception ");
	throw new SkipException("Skip the Test Forcefully");
	}
	@Test
	public void skipTest3()
	{
		if(datasetup)
		{
			System.out.println("Test not skipped and continued the test steps for further ");
			
		}
		
		else {
			 	System.out.println("Skipt the test excecution ");
			 	throw new SkipException("Skip the Test for condition");
			 }
	
	}
}
