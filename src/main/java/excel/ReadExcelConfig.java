package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelConfig
{
	FileInputStream File;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ReadExcelConfig(String excelPath)
	{
		try
		{
			File myfile = new File(excelPath);
			
			
			File = new FileInputStream(myfile);
			wb = new XSSFWorkbook(File);
				
			sheet = wb.getSheetAt(0);
			//int noofrows = sheet.getLastRowNum();
		} 
		
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public String getData (int sheetno, int row, int col)
	{
		String Data = sheet.getRow(row).getCell(col).getStringCellValue();
		System.out.println(Data);
		
		return Data;
	}
}
