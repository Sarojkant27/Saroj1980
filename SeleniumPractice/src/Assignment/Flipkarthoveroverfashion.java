package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkarthoveroverfashion {

	public static void main(String[] args) throws InterruptedException 
	{// Launch flipkart application, hover over fashion and click mens-tshirt
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement we=	driver.findElement(By.className("_27h2j1"));
	    Actions A1=new Actions(driver);
	    A1.moveToElement(we).perform();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Men's T-Shirts")).click();
	
	
	//driver.close();
		

	}

}
