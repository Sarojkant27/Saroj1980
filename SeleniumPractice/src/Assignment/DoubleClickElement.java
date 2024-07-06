package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickElement {
	public static ChromeDriver driver;
	public static void driver()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	public static void doubleclick()
	{
		driver();
		WebElement w=driver.findElement(By.linkText("Gmail"));
		Actions a1=new Actions(driver);
		a1.doubleClick(w).perform();
		driver.close();
	}
	public static void rightclick() throws InterruptedException
	{
		driver();
		WebElement w=driver.findElement(By.linkText("Gmail"));
		Actions a1=new Actions(driver);
		a1.contextClick(w).perform();
		Thread.sleep(2000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException 
	{
		doubleclick();
		rightclick();
		
		
	}

}
