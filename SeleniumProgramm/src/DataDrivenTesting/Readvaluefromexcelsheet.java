package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readvaluefromexcelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=	new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\SeleniumProgramm\\DataSheet\\DDTSheet.xlsx");
		Workbook w1	 = WorkbookFactory.create(f1);
		 Sheet s1=w1.getSheet("Sheet1");
		Row r1= s1.getRow(2);
		Cell c1=r1.getCell(1);
		String username= c1.getStringCellValue();
		System.out.println(username);

	}

}
