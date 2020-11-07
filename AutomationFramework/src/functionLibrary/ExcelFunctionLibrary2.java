package functionLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunctionLibrary2 {
	
	XSSFWorkbook wb;
	String path;
	public ExcelFunctionLibrary2(String path) throws IOException
	{
		this.path=path;
		FileInputStream file = new FileInputStream(path);

		// Step 3
		wb = new XSSFWorkbook(file);
	}

	public String getCelllData(String sheetName, int rowNumber, int colNumber) throws IOException
	{

		// Step 4
		XSSFSheet sheet = wb.getSheet(sheetName);

		// Step 5
		XSSFRow row = sheet.getRow(rowNumber);
		
		//Step 6
		XSSFCell cell=row.getCell(colNumber);
		
		//Step 7
		String data=cell.getStringCellValue();		
		
		return data;
	}
	
	public void setCellData(String sheetName, int rowNumber, int colNumber, String data) throws IOException
	{

		// Step 4
		XSSFSheet sheet = wb.getSheet(sheetName);

		// Step 5
		XSSFRow row = sheet.getRow(rowNumber);
		if(row==null)
			row=sheet.createRow(rowNumber);
		
		//Step 6
		XSSFCell cell=row.getCell(colNumber);
		if(cell==null)
			cell=row.createCell(colNumber);
		
		if (row==null)
			row=sheet.createRow(rowNumber);
		
		//Step 7
		cell.setCellValue(data);
		if(cell==null)
			cell=row.createCell(colNumber);
		
		FileOutputStream ofile=new FileOutputStream(path);
		wb.write(ofile);
	}
	
	
	public int getNumberOfRows(String sheetName) throws IOException
	{		
		   
			// Step 4
			XSSFSheet sheet = wb.getSheet(sheetName);
			
			return sheet.getPhysicalNumberOfRows();
	}

	public int getNumberOfColumns(String sheetName, int rowNumber) throws IOException
	{		
			// Step 4
			XSSFSheet sheet = wb.getSheet(sheetName);
			
			return sheet.getRow(rowNumber).getPhysicalNumberOfCells();
	}
	
	public int getNumberOfColumns(String sheetName) throws IOException
	{		
		   
			// Step 4
			XSSFSheet sheet = wb.getSheet(sheetName);
			
			return sheet.getRow(0).getPhysicalNumberOfCells();
	}
}
