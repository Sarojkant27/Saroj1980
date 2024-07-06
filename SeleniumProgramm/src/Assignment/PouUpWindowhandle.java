package Assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PouUpWindowhandle {
WebDriver driver;
@DataProvider(name="test1")
public Object FBdata()
{
	Object a1[][]=new Object [5][4];
	a1[0][0]="saroj";
	a1[0][1]="kund";
	a1[0][2]="8080656110";
	a1[0][3]="Password1@";
	a1[1][0]="Ram";
	a1[1][1]="Bhatnagar";
	a1[1][2]="8080656111";
	a1[1][3]="Password2@";
	a1[2][0]="Sham";
	a1[2][1]="Patnaik";
	a1[2][2]="8080656112";
	a1[2][3]="Password3@";
	a1[3][0]="Bhushan";
	a1[3][1]="pandit";
	a1[3][2]="8080656113";
	a1[3][3]="Password3@";
	a1[4][0]="Akshay";
	a1[4][1]="kasar";
	a1[4][2]="8080656114";
	a1[4][3]="Password4@";
	
	return a1;
}

	@Test(dataProvider="test1")
	public void facebook(String FN, String LN, String mob,  String pwd )
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		//driver.switchTo().frame(driver.findElement(By.cssSelector("#content > div > div")));
//		for (String handle : driver.getWindowHandles()) {
//            driver.switchTo().window(handle);
//        }
//		String Pid=driver.getWindowHandle();
//		Set<String> Cid=driver.getWindowHandles();
//	    Iterator<String> pc= Cid.iterator();
//	    String parentid=pc.next();
//	    String childid=pc.next();	    
//	    driver.switchTo().window(childid);
	    driver.findElement(By.name("firstname")).sendKeys(FN);
	    driver.findElement(By.name("lastname")).sendKeys(LN);
	    driver.findElement(By.name("reg_email__")).sendKeys(mob);
	    driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);
	    WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
	    Select s1=new Select(day);
	    s1.selectByIndex(3);
	    WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
	    Select s2=new Select(month);
	    s2.selectByIndex(6);
	    WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
	    Select s3=new Select(year);
	    s3.selectByValue("1990");
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
	    
	    
	   
	    
	
	
	}

	}

