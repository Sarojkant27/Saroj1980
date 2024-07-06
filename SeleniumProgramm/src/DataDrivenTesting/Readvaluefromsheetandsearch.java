package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readvaluefromsheetandsearch {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f1=new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\SeleniumProgramm\\DataSheet\\DDTSheet.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1=w1.getSheet("Sheet1");
	Row r1=s1.getRow(2);
	Cell c1=r1.getCell(1);
	String value=c1.getStringCellValue();
	System.out.println(value);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement w=driver.findElement(By.name("q"));
	w.sendKeys(value);
	w.sendKeys(Keys.ENTER); 
	
}
}
