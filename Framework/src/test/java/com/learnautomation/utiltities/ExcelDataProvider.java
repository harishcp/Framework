package com.learnautomation.utiltities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	//Constructor
	// This constructor below just helps in loading the excel as
	// soon as we create an object for this class,
	// so we don't have to provide the excel path again and again
	public ExcelDataProvider()
	{
		File src = new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);  //converts the excel file to raw data
			
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println("Unable to read Excel File"+e.getMessage());
			
		} 
		
	}
	
	// Method Overloading concept
	// Method name is same, parameter types are
	// changing - This is called Method OverLoading
	public String getStringData(int sheetIndex, int row, int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}

	public String getStringData(String sheetname, int row, int column)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetname, int row, int column)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
	}
}
