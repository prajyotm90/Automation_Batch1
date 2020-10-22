package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Step 1
		String path="D:\\Automation_Batch1\\Automation_Batch1\\TestNGProject2\\src\\readExcel\\testData.xlsx";
		
		
		//Step 2
		FileInputStream file=new FileInputStream(path);
		
		//Step 3
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		//Step 4
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		//Step 5
		XSSFRow row=sheet.getRow(0);
		
		//Step 6
		XSSFCell column=row.getCell(0);
		
		//Step 7
		String data=column.getStringCellValue();
		
		System.out.println(data);
		
		
	}

}
