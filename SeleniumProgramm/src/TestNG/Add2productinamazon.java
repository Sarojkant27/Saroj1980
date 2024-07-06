package TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Add2productinamazon {
	@Test

	public void addproduct() throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	//Add 1st Product
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("twostates");
	search.sendKeys(Keys.ENTER);
	WebElement Book=driver.findElement(By.xpath("//img[@alt='2 STATES THE STORY OF MY MARRIAGE']"));
	Book.click();
	
	String pid=		driver.getWindowHandle();
	Set<String> pandcid=	driver.getWindowHandles();
	Iterator<String> pc=			pandcid.iterator();
	String parentid=		pc.next();
	String childid=		pc.next();
	System.out.println(parentid);
	System.out.println(childid);
	driver.switchTo().window(childid);
	WebElement addtocart1=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	addtocart1.click();
	WebElement price1=driver.findElement(By.className("a-price-whole"));
	String p1=price1.getText();
	double Amount1= Double.parseDouble(p1);
	System.out.println(Amount1);
	//Add2nd Product
	WebElement search2=driver.findElement(By.id("twotabsearchtextbox"));
	search2.sendKeys("lakme sunscreen spf50");
	
	Thread.sleep(2000);
	search2.sendKeys(Keys.ENTER);
	WebElement phone=driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']"));
	phone.click();
	WebElement price2=driver.findElement(By.xpath("//span[@class='a-price-whole']"));
	String p2=price2.getText();
	double Amount2= Double.parseDouble(p2);
	String stringNum = Double.toString(Amount2);
	System.out.println(stringNum);
	Thread.sleep(5000);
	WebElement cartAmount=driver.findElement(By.xpath("//span[contains(@class,'a-size-base a-color-price')]"));
	String price=cartAmount.getText();
	double Totalamount= Double.parseDouble(price);
	System.out.println(Totalamount);
	double Totalmanual=Amount1+Amount2;
	System.out.println(Totalmanual);
	Assert.assertEquals(Totalamount, Totalmanual, "pass");

}
}
