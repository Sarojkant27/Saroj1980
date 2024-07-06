package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingANVAxpathinamazonsearchbox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchtext=driver.findElement(By.xpath("(//input)[@id='twotabsearchtextbox']"));
		searchtext.sendKeys("shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//searchtext.sendKeys(Keys.ENTER);
		
		
		

	}

}
