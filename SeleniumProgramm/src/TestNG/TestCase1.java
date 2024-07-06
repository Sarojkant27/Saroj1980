package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 
{
@Test(retryAnalyzer=TestNG.IRAProgramm1.class)
public void login() throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement username=	driver.findElement(By.xpath("(//input)"));
	username.sendKeys("skund27@gmail.com");
	WebElement password=	driver.findElement(By.xpath("(//input)[4]"));
	password.sendKeys("xxxxxxx");//just i changed to password to xxxxx
	Thread.sleep(4000);
	WebElement login=driver.findElement(By.xpath("(//button)[1]"));
	login.click();
}
}
