package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFacebookwith5DataProvider {
	WebDriver driver;
	@DataProvider(name="test1")
	public Object data_facebook()
	{
		Object a1[][]=new Object [5][2];
		a1[0][0]="skund27@gmail.com";
		a1[0][1]="Sarojine1@";
		a1[1][0]="sita@gmail.com";
		a1[1][1]="sita@7654t6";
		a1[2][0]="shiva@gmail.com";
		a1[2][1]="shiva@7654t6";
		a1[3][0]="ashwini@gmail.com";
		a1[3][1]="ashwini@7654t6";
		a1[4][0]="hari@gmail.com";
		a1[4][1]="hari@7654t6";
		
		return a1;
	}
	@Test(dataProvider="test1")
	public void facebook_login(String UN,String PWD)
	{
		driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");	
	driver.findElement(By.id("email")).sendKeys(UN);
	driver.findElement(By.id("pass")).sendKeys(PWD);
	driver.findElement(By.name("login")).click();
	//driver.switchTo().alert().accept();
//	if (UN=="skund27@gmail.com" && PWD=="Sarojine1@")
//	{
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/", "Sorry search is not proper");
//	}
//	if (UN=="hari@gmail.com" && PWD=="hari@7654t6")
//	{
//	
//	} 
}

}
