package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/Data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Data");
		Row row = sheet.getRow(1);
		Cell cell = row.createCell(2);
		cell.setCellValue("Pass");
		
		//open the workbook in a writable mode
		FileOutputStream fos = new FileOutputStream("./src/test/resources/Data.xlsx");
		//write the data into excel file
		book.write(fos);
		System.out.println("data sent successfully");
	}
}
