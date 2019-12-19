package WTW;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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
			
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		String data1 = sheet.getRow(0).getCell(1).getStringCellValue();
		
		boolean count = sheet.getR
		
		System.out.println("Count : " +count);
		//XSSFRow rows = sheet.getRow(0);
		System.out.print(data+ " ");
		System.out.print(data1);
			
	}

}
