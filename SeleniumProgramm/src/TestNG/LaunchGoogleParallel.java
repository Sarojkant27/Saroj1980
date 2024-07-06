package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchGoogleParallel {
	WebDriver driver;
	@Test
	//@Parameters("browser")
	public void googleclick()
	//public void launchgoogle(String whichbroswer)
	{
//		if (whichbroswer.equals("chrome"))
//		{
//			 driver=new ChromeDriver();
//		}
//		if (whichbroswer.equals("edge"))
//		{
//			 driver=new EdgeDriver();
//		}
	    driver=new EdgeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("q")).sendKeys("Today"+Keys.ENTER);
		//rightclick
		WebElement w1=driver.findElement(By.linkText("Gmail"));
		Actions a1=new Actions(driver);
		a1.contextClick(w1).perform();
		
	}

}
