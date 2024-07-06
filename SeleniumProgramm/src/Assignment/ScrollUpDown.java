package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement categroy=driver.findElement(By.name("q"));
		categroy.sendKeys("test");
		categroy.sendKeys(Keys.ENTER);
//		WebElement w1=driver.findElement(By.linkText("COVID-19 and Amazon"));
//		Point p1=w1.getLocation();
//		int x=p1.getX();
//		int y=p1.getY();
//		System.out.println(x);
//		System.out.println(y);
		//The scroll down by y axix 
		JavascriptExecutor js1= driver;
		
		for (int i=0;i<1;i--)
		{
		
		js1.executeScript("window.scrollBy(0, 200)");
		//Thread.sleep(2000);
		}

	}

}
