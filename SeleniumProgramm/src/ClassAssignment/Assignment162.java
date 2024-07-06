package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment162 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement w=driver.findElement(By.name("q"));
		w.sendKeys("India");
	w.sendKeys(Keys.ENTER);
		
		

	}

}
