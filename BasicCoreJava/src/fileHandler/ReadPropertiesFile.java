package fileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));

		String filepath = System.getProperty("user.dir") + "\\src\\fileHandler\\TestData1.properties";
		// D:\Automation_Batch1\Automation_Batch1\BasicCoreJava\src\fileHandler\TestData.properties

		System.out.println(filepath);

		FileInputStream file = new FileInputStream(filepath);

		Properties p = new Properties();
		p.load(file);

		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("Age"));
		System.out.println(p.getProperty("surname"));
	}

}
