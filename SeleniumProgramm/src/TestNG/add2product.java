package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class add2product {
	
	@Test
	public void price()
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Search Shoes 
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("Shoes");
	search.sendKeys(Keys.ENTER);
	
	//SHOE1-Price
	WebElement shoeprice1=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	String priceofshoe1=shoeprice1.getText().replace(",", "");
	int price1=Integer.parseInt(priceofshoe1);
	System.out.println(priceofshoe1);
	
	//SHOE2-Price
	WebElement shoeprice2=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]"));
	String priceofshoe2=shoeprice2.getText().replace(",", "");
	int price2=Integer.parseInt(priceofshoe2);
	
	
	System.out.println(priceofshoe2);
	
	//int a1=(int) s2;//cannot convert int to String
	
	//Add SHOE1 to cart
	WebElement shoe1=driver.findElement(By.xpath("(//div[@class='_bGlmZ_itemImage_1kTKp _bGlmZ_expandedItemImageT1_23GyI'])[1]"));
	shoe1.click();
	WebElement addToCartbutton=driver.findElement(By.xpath("//span[@id='submit.add-to-cart']"));
	addToCartbutton.click();
	
	//Search Shoes again
	WebElement search1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search1.sendKeys("Shoes");
	search1.sendKeys(Keys.ENTER);
	
	//Add SHOE2 to cart
	WebElement shoe2=driver.findElement(By.xpath("(//div[@class='_bGlmZ_itemImage_1kTKp _bGlmZ_expandedItemImageT1_23GyI'])[2]"));
	shoe2.click();
	WebElement addToCartbutton2=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	addToCartbutton2.click();
	
	//To get the total amount from the cart
	WebElement cartAmount=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	String priceofshoe1and2=cartAmount.getText().replace(",", "");
	int totalpricefromcart=Integer.parseInt(priceofshoe1and2);
	int totalpriceoftwoproduct=(price2+price1);
	System.out.println(totalpricefromcart);
	System.out.println(totalpriceoftwoproduct);
	Assert.assertEquals(totalpricefromcart, totalpriceoftwoproduct, "Matching vlaue");
	
	}

}
