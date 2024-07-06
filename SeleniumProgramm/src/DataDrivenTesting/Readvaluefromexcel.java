package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readvaluefromexcel {
	
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
    	FileInputStream f1= new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\SeleniumProgramm\\DataSheet\\DDTSheet.xlsx");
        Workbook  w1= WorkbookFactory.create(f1);
        String s1= w1.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
        System.out.println(s1);
	}

}
