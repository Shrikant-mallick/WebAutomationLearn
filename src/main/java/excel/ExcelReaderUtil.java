package excel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderUtil
{

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub

		File myfile = new File("C:\\TestData\\MyTestData.xlsx");
		
		
		FileInputStream File = new FileInputStream(myfile);
		XSSFWorkbook wb = new XSSFWorkbook(File);
			
		XSSFSheet sheet = wb.getSheetAt(0);
		int noofrows = sheet.getLastRowNum();
		System.out.println("Rows  " + noofrows);
		
		
		XSSFRow rows = sheet.getRow(0);	
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		String data1 = sheet.getRow(0).getCell(1).getStringCellValue();
		
		
		
//		System.out.println("Count : " +count);
//		XSSFRow rows = sheet.getRow(0);
//		System.out.print(data+ " ");
//		System.out.print(data1);
		
		for (int i=0; i<=noofrows;i++)
		{
			String data0 = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data 0:" + data0);
		}
			
		wb.close();
	}

}
