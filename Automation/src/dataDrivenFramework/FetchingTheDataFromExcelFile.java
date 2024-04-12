package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingTheDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		//create the object for FileInputStream class
		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		//open the workbook in readable mode
		Workbook book = WorkbookFactory.create(fis);
		//get the sheet
		Sheet sheet = book.getSheet("Data");
		//get the row
		Row row = sheet.getRow(1);
		//get the cell
		Cell cell = row.getCell(0);
		//convert into string
		String username = cell.getStringCellValue();
		System.out.println(username);
		//get the password
		Cell pwd = row.getCell(1);
		System.out.println(pwd);
		
		
		
		
	}

}
