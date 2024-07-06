package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {

	public static void main(String[] args) throws InterruptedException
	{ //Hover over on Amazon website on using moveToElement()
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		//Create WebElement. WebElement in Selenium is essentially an HTML element on a website
		WebElement we	=driver.findElement(By.id("nav-link-accountList"));
		//Created the object of Action class
		Actions a1=new Actions(driver);
		//Using the reference variable we have to utilize the moveToelement method ()
		//a1.moveToElemnt(Target element)
		a1.moveToElement(we).perform();
		Thread.sleep(1000);
		//Click on any WebElement e.g: linktext.
		driver.findElement(By.linkText("Sign in")).click();

	}

}
