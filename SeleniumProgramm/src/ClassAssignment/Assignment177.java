package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment177 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 WebElement w=driver.findElement(By.id("searchDropdownBox"));
		// w.click();
		 for (int i=0;i<=10;i++)
		 {
		 w.sendKeys(Keys.DOWN);
		 }
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 

	}

}
