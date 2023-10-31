package ExternalTestData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		Properties property = new Properties();
		FileInputStream input = new FileInputStream("D:\\Yash\\Selenium Projects\\Maven_selenium_project\\maven_selenium\\src\\test\\resources\\Configurations\\data.properties");
		property.load(input);
		System.out.println(property.getProperty("Ebay_url"));
		
		FileOutputStream output = new FileOutputStream("D:\\Yash\\Selenium Projects\\Maven_selenium_project\\maven_selenium\\src\\test\\resources\\Configurations\\data.properties");
		property.setProperty("Item", "Mobiles");
		property.store(output, "Item added by Code");
	}

}
