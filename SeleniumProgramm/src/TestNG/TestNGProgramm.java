package TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGProgramm 
{
	WebDriver driver;
	@Test 
	@Parameters("browser")
	public void lunch_chrome(String test) throws InterruptedException
	{ 
		if (test.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		if (test.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		if (test.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		
		
		/*driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement w=driver.findElement(By.name("q"));
		w.sendKeys("India");
		w.sendKeys(Keys.ENTER);*/
//		try
//		{
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement serach= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serach.sendKeys("shoe");
		Thread.sleep(3000);
		serach.sendKeys(Keys.ENTER);
		WebElement firstshoe= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[5]"));
		Thread.sleep(2000);
		firstshoe.click();
		String pid= driver.getWindowHandle();
		Set<String> pandcid= driver.getWindowHandles();
		System.out.println(pid);
		System.out.println(pandcid);
		Iterator<String> pc= pandcid.iterator();
		String parentid= pc.next();
		String childid= pc.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		//driver.manage().window().maximize();
		driver.findElement(By.name("submit.buy-now")).click();
		//Thread.sleep(7000);
		//driver.close();
		}
//		catch(Exception e)
//		{
//			System.out.println(e.getClass());
//		}

		
	}
	


