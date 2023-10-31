package TestNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderFile {
	@DataProvider(name = "create")
	public Object[][] dataset(Method m)
	{
		Object[][] testdata = null;
		if(m.getName().equals("Test1"))
		{
			testdata = new Object[][]
					{
						{"standard_user","secret_sauce"},
						{"locked_out_user","secret_sauce"},
						{"problem_user","secret_sauce"},
						{"performance_glitch_user","secret_sauce"}
					};
		}
		else if(m.getName().equals("Test2"))
		{
			testdata = new Object[][]
					{
						{"standard_user",123,"Hi"},
						{"locked_out_user",456,"hello"},
						{"problem_user",789,"how"},
						{"performance_glitch_user",910, "are you"}
					};
		}
		return testdata;
		
	}
}
