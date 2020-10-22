package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunctionLibrary {
	//Read file-Hardcoded values. Workbook name,sheet name, Row no, Col no
	//1. Workbook
	//2.
	
	public String getCellData(String sheetName,int rowNumber, int columnNumber) throws IOException {
				//Step 1
				String path="D:\\Automation_Batch1\\Automation_Batch1\\TestNGProject2\\src\\readExcel\\testData.xlsx";
				
				
				//Step 2
				FileInputStream file=new FileInputStream(path);
				
				//Step 3
				XSSFWorkbook wb=new XSSFWorkbook(file);
				
				//Step 4
				XSSFSheet sheet=wb.getSheet(sheetName);
				
				//Step 5
				XSSFRow row=sheet.getRow(rowNumber);
				
				//Step 6
				XSSFCell column=row.getCell(columnNumber);
				
				//Step 7
				String data=column.getStringCellValue();
				
				
				return data;		
	}
	
	
	public int getNumberOfRows(String sheetName) throws IOException {
		String path="D:\\Automation_Batch1\\Automation_Batch1\\TestNGProject2\\src\\readExcel\\testData.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet(sheetName);
		return sheet.getPhysicalNumberOfRows();
	}
	
	public int getNumberOfColumns(String sheetName) throws IOException {
		//Get column count for row nimber zero assuming that we have data in tabular form
		String path="D:\\Automation_Batch1\\Automation_Batch1\\TestNGProject2\\src\\readExcel\\testData.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet(sheetName);
		return sheet.getRow(0).getPhysicalNumberOfCells();
	}
	
	public int getNumberOfColumns(String sheetName,int rowNumber) throws IOException {
		//Get Dynamic data for each row column count
		String path="D:\\Automation_Batch1\\Automation_Batch1\\TestNGProject2\\src\\readExcel\\testData.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet(sheetName);
		return sheet.getRow(rowNumber).getPhysicalNumberOfCells();
	}

}
