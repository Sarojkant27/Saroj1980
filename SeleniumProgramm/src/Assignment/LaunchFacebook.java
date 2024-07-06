package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchFacebook {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void launch_facebook(String browsername)
	{
		if (browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if (browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		//EdgeDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("rtwret@test.com");
		driver.findElement(By.id("pass")).sendKeys("wrtwetwr");
		driver.findElement(By.name("login")).click();
	}

}
