package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Aamazonloginwith5dataset {
	WebDriver driver;
	@DataProvider(name="test1")
	public Object unpwd()
	{
		Object a1[][]=new Object [5][2];
		a1[0][0]="skund27@gmail.com";
		a1[0][1]="mwtest@";
		a1[1][0]="8080656110";
		a1[1][1]="mwtest@";
		a1[2][0]="918080656110";
		a1[2][1]="mwtest@";
		a1[3][0]="test1@test.com";
		a1[3][1]="mwtest@";
		a1[4][0]="8080656110";
		a1[4][1]="Udaya";
		return a1;
	}
	
	@Test(dataProvider="test1")
	public void amazonlogin(String UN, String PWD)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(UN);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(PWD);
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/?ref_=nav_ya_signin", "Sorry login is not successfull");
	}

}
