package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchDataProviderAssertion {
	WebDriver driver;
	@DataProvider(name="data1")
	public Object politician()
	{
		return new Object[][] {{"Modi"},{"Naveen Patnaik"},{"Amit Shah"},{"kejriwal"},{"Rahul Gandhi"}};
	}
	
	@Test(dataProvider="data1")
	public void search_polician(String input)
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement w=driver.findElement(By.name("q"));
		w.sendKeys(input);
		w.sendKeys(Keys.ENTER);
		
		if (input=="Modi")
		{
		Assert.assertEquals(driver.getTitle(), "Modi - Google Search", "Sorry search is not proper");
		}
		if (input=="Amit Shah")
		{
		Assert.assertEquals(driver.getTitle(), "Amit Shah - Google Search", "Sorry search is not proper");
		}
		if (input=="Naveen Patnaik")
		{
		Assert.assertEquals(driver.getTitle(), "Naveen Patnaik - Google Search", "Sorry search is not proper");
		}
		if (input=="kejriwal")
		{
		Assert.assertEquals(driver.getTitle(), "kejriwal - Google Search", "Sorry search is not proper");
		}
		if (input=="Rahul Gandhi")
		{
		Assert.assertEquals(driver.getTitle(), "Rahul Gandhi - Google Search", "Sorry search is not proper");
		}
		
	}

}
