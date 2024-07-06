package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginamazonXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement accountlist=driver.findElement(By.xpath("(//a)[6]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountlist).perform();
		driver.findElement(By.xpath(""));
		

	}

}
