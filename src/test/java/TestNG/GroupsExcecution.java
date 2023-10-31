package TestNG;


import org.testng.annotations.Test;
@Test(groups = "Smoke")
public class GroupsExcecution 
{
	@Test(groups = "BVT")
	public static void login1()
	{
		System.out.println("Log in to a application 1 ");
	}
	@Test(groups = "BVT")
	public static void logout1()
	{
		System.out.println("Log out Appllication 1 ");
	}
	@Test(groups = {"BVT", "E2E"})
	public static void login2()
	{
		System.out.println("Log in to a application 2 ");
	}
	@Test(groups = "E2E" )
	public static void logout2()
	{
		System.out.println("Log out Appllication 2 ");
	}
}
