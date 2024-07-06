package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SbiRegistration {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.get("https://retail.onlinesbi.sbi/retail/newuserreg.htm");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		WebElement e=d.findElement(By.name("issueCode"));
		//Thread.sleep(1000);
		e.click();
		Select s=new Select(e);
		s.selectByVisibleText("New User Registration");
		//s.selectByIndex(0);
		//s.selectByValue("registerHere");
		//Thread.sleep(1000);
		d.findElement(By.id("nextStep")).click();
		//d.findElement(By.name("nextStep")).click();
		//d.findElement(By.xpath("(//input)[2]")).click();
		d.findElement(By.xpath("(//input)[2]")).sendKeys("22423412341");
		d.findElement(By.xpath("(//input)[3]")).sendKeys("22423412341");
		d.findElement(By.xpath("(//input)[4]")).sendKeys("12345");
		WebElement e1=d.findElement(By.name("countryCode"));
		e1.click();
		Select s2=new Select(e1);
		s2.selectByIndex(1);
		//Thread.sleep(1000);
		d.findElement(By.xpath("(//input)[7]")).sendKeys("2435243524");
		WebElement e2=d.findElement(By.name("txnRights"));
		e2.click();
		Select s3=new Select(e2);
		s3.selectByIndex(1);
		//d.findElement(By.xpath("(//input)[9]")).sendKeys("3546D");
		Thread.sleep(2000);
		d.findElement(By.name("I Agree")).click();
		Thread.sleep(2000);
		d.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		/*boolean b1=iagree.isDisplayed();
		boolean b2=iagree.isEnabled();
		if(b1 && b2)
		{
			iagree.click();
		}
		
		WebElement submit=d.findElement(By.name("Submit"));
		boolean b3=submit.isDisplayed();
		boolean b4=submit	.isEnabled();
		if(b3 && b4)
		{
			iagree.click();
		}*/
		
		
		
		
		
		
		
		
		 

	}

}
