package learningSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	public static void main(String[] args) throws Exception {
		//Specifying the location
		File src = new File("C:\\Users\\admin\\eclipse-workspace\\AutomationSelenium\\Excel\\TestSheet.xlsx");
		//load file
		FileInputStream workbook = new FileInputStream(src);
		//load workbook
		XSSFWorkbook wb = new XSSFWorkbook(workbook);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	}

}
