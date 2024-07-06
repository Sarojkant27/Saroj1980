package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gmail {
	@Test
	public void gettitle()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		//Assert.assertEquals(driver.getTitle(), "https://us06web.zoom.us/j/84306419939", "Sorry not matching");
		Assert.assertEquals(driver.getCurrentUrl(), "Gmail: Private and secure email at no cost | Google Workspace","Sorry not matching" );
		
	}

}
