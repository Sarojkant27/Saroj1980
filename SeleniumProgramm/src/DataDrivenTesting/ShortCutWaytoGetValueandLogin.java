package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShortCutWaytoGetValueandLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\SeleniumProgramm\\DataSheet\\DDTSheet.xlsx");
        Workbook w1=WorkbookFactory.create(f1);
        String username= NumberToTextConverter.toText(w1.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue());
       String password=  w1.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
       System.out.println(username);
       System.out.println(password);
       ChromeDriver driver=new ChromeDriver();
   	   	driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	    //driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.xpath("(//input)[7]")).sendKeys(username);
	    driver.findElement(By.className("a-button-input")).click();
	    driver.findElement(By.id("ap_password")).sendKeys(password);
	    driver.findElement(By.id("signInSubmit")).click();
		    	
	}

}
