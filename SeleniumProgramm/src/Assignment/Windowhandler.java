package Assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandler {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
//		try
//		{
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement serach= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serach.sendKeys("shoe");
		Thread.sleep(3000);
		serach.sendKeys(Keys.ENTER);
		WebElement firstshoe= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/span/div/div/div[2]/div/span/a/div/img"));
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
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getClass() + " I handled exception");
//		}
	}

}
