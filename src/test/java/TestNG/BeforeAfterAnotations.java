package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterAnotations 
{
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println(" Application configured before class executed");
	}
	@AfterClass
	public static void Afterclass()
	{
		System.out.println(" Application configured After class  executed");
	}
	
	@BeforeGroups(value = "UI")
	public static void beforegroup()
	{
		System.out.println(" Application configured only before described group");
	}
	@AfterGroups(value = "UI")
	public static void afterGroups()
	{
		System.out.println(" Application configured only after described group");
	}
	@BeforeTest
	public static void preconfigurations()
	{
		System.out.println(" Application preconfiguration happened");
	}
	@AfterTest
	public static void postconfigurations()
	{
		System.out.println(" Application post configuration done");
	}
	@BeforeMethod
	public static void DataBaseConnected()
	{
		System.out.println(" Application connected to DataBase");
	}
	@AfterMethod
	public static void DataBaseDisConnected()
	{
		System.out.println(" Application Disconnected to DataBase");
	}
	
	@Test(groups = "UI")
	public static void login()
	{
		System.out.println("Log in to a application");
	}
	@Test(groups = "Regression")
	public static void logout()
	{
		System.out.println("Log out Appllication");
	}
}
