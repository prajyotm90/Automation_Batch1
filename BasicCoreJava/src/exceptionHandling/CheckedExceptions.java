package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CheckedExceptions {
	// CheckedExceptions since they are checked or identified at complie time
	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Sanket");
		Thread.sleep(5000);
		// Exception 1: InterruptedException
		System.out.println("Kishan");

		// Exception 2: FileNotFoundException
		FileInputStream file = new FileInputStream("");

		Properties p = new Properties();
		// Exception 3: IOException
		p.load(file);

	}

}
