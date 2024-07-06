package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragandDropJson {
	static ChromeDriver driver;
	public static void chromedriver()
	{
		 driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	public static void dragdropjson() throws InterruptedException
	{
		chromedriver();
		WebElement drag_element=driver.findElement(By.id("drag11"));
		WebElement drop_element=driver.findElement(By.id("div2"));
	Actions a1=new Actions(driver);
		a1.dragAndDrop(drag_element, drop_element).perform();
		Thread.sleep(2000);
		driver.close();
	}
	public static void dragdropSelenium() throws InterruptedException
	{
		chromedriver();
		WebElement drag=driver.findElement(By.id("drag6"));
		WebElement drop=driver.findElement(By.id("div2"));
	Actions a2=new Actions(driver);
		a2.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
	}
	public static void dragdropCucumber() throws InterruptedException
	{
		chromedriver();
		WebElement drag=driver.findElement(By.id("drag1"));
		WebElement drop=driver.findElement(By.id("div2"));
	Actions a2=new Actions(driver);
		a2.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
	}
	public static void dragdropEclipse() throws InterruptedException
	{
		chromedriver();
		WebElement drag=driver.findElement(By.id("drag4"));
		WebElement drop=driver.findElement(By.id("div2"));
	Actions a2=new Actions(driver);
		a2.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
	}
	public static void dragdropJenkin() throws InterruptedException
	{
		chromedriver();
		WebElement drag=driver.findElement(By.id("drag3"));
		WebElement drop=driver.findElement(By.id("div2"));
	    Actions a2=new Actions(driver);
		a2.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
	}
	public static void dragdropSpringBoot() throws InterruptedException
	{
		chromedriver();
		WebElement drag=driver.findElement(By.id("drag10"));
		WebElement drop=driver.findElement(By.id("div2"));
	    Actions a2=new Actions(driver);
		a2.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
	}
	public static void dragdropSql() throws InterruptedException
	{
		chromedriver();
		WebElement drag=driver.findElement(By.id("drag9"));
		WebElement drop=driver.findElement(By.id("div2"));
	    Actions a2=new Actions(driver);
		a2.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		dragdropjson();
		dragdropSelenium();
		dragdropCucumber();	
		dragdropEclipse();
		dragdropJenkin();
		dragdropSpringBoot();
		
	}

}
