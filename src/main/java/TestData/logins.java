package TestData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class logins 
{
	public Properties getProperties() throws IOException
	{
		Properties property = new Properties();
		FileInputStream input = new FileInputStream("D:\\Yash\\Selenium Projects\\Maven_selenium_project\\maven_selenium\\src\\test\\resources\\Configurations\\logins.properties");
		property.load(input);
		
		return property;
	}
	public String geturl() throws IOException 
	{
		return getProperties().getProperty("url");
	}
	public String getusername() throws IOException 
	{
		return getProperties().getProperty("username");
	}
	public String getpass() throws IOException 
	{
		return getProperties().getProperty("password");
	}
}

		/*String ur = property.getProperty("url");
		String us = property.getProperty("username");
		String pass = property.getProperty("password");
		
		System.out.println("url is : "+ ur);
		System.out.println("username is : "+ us);
		System.out.println("password is : "+ pass);
		
		FileOutputStream output = new FileOutputStream("D:\\Yash\\Selenium Projects\\Maven_selenium_project\\maven_selenium\\src\\test\\resources\\Configurations\\logins.properties");
		property.setProperty(key, value);
		property.store(output, null);*/
		
		
	

