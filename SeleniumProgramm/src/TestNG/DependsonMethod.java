package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethod {
	WebDriver driver;
	@Test
	public void lunch()
	{
		Assert.assertEquals(false, true);
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@Test(dependsOnMethods="lunch")
	public void quit()
	{
		driver.close();
	}

}
