package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelData {
	
	public static String exceldata(int i ,int j) throws EncryptedDocumentException, IOException
	{
		String path="C:\\Users\\anike\\Desktop\\TestCaseGroup12.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		Sheet sheet=WorkbookFactory.create(file).getSheet("Test");
		
		String testData=sheet.getRow(i).getCell(j).getStringCellValue();
		
		return testData;
		
	}

}
