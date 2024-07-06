package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment178 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement w=driver.findElement(By.linkText("Best Sellers"));
		Actions a=new Actions(driver);
		a.moveToElement(w).perform();
		
	}
	

}
