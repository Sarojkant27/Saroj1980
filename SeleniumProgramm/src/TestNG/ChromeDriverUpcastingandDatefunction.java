package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

public class ChromeDriverUpcastingandDatefunction {
	ChromeDriver driver;
	@BeforeMethod
	public void lunchbrowser()
	{
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void search1()
	{
		driver.findElement(By.name("q")).sendKeys("Sachin");
			
	}
	@Test
	public void search2()
	{
		driver.findElement(By.name("q")).sendKeys("Modi 2024");
			
	}
	@AfterMethod
	public void closebrowser() throws InterruptedException, IOException
	
	{
		 Date d=new Date();
		 Date d2=new Date(d.getTime());
		 String Currentime=d2.toString().replace(":", "_");
		 TakesScreenshot t1=driver;
		 File source= t1.getScreenshotAs(OutputType.FILE) ;
		 File destination=new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumProgramm\\Scrrenshot\\"+Math.random()+""+Currentime+"testng.png");
		 FileHandler.copy(source, destination);
		 Thread.sleep(2000);
		 driver.quit();
	}
}
