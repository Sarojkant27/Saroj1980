package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LunchQuit {
	WebDriver driver;
	@BeforeMethod
	@Parameters("nameofbroswer")
	public void lunch_browser(String whichbroswer)
	{
	if (whichbroswer.equals("chrome"))
	{
		driver= new ChromeDriver();
	}
	if (whichbroswer.equals("firefox"))
	{
		driver= new FirefoxDriver();
	}
	if (whichbroswer.equals("edge"))
	{
		driver= new EdgeDriver();
	}
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	}
	@AfterMethod
	public void quit()
	{
		
	}
}
