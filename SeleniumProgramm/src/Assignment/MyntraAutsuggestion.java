package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAutsuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.tagName("input")).sendKeys("Bag");
		Thread.sleep(3000);
	    List<WebElement> a=	driver.findElements(By.xpath("//ul[@class='desktop-group']/li"));
	    a.get(4).click();
	}

}
	