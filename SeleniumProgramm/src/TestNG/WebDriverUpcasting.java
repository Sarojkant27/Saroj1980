package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverUpcasting 
{
	WebDriver driver;
  @Test
public void lunchbrowser()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
}
  
  @Test
  public void lunchfirefox()
  {
  	driver=new FirefoxDriver();
  	driver.get("https://www.google.com/");
  	
  }
	
}
