package TestNG;

import org.testng.annotations.Test;

public class SampleTestNG1 {
	@Test(priority = 2)
	public static void HelloWord()
	{
		System.out.println("Print hello word");
	}
	@Test(priority = 1)
	public static void HelloJava()
	{
		System.out.println("Print hello Java");
	}
}
