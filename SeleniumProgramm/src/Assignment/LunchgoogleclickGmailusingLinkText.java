package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchgoogleclickGmailusingLinkText {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement w=driver.findElement(By.name("q"));
		w.sendKeys("Sunny Deol");
		w.sendKeys(Keys.ENTER);
		
		
		

	}

}
