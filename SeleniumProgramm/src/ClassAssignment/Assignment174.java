package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment174 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		WebElement w=driver.findElement(By.id("fname"));
		w.sendKeys("saroj");
		w.sendKeys(Keys.CONTROL+"a");
		w.sendKeys(Keys.CONTROL+"c");
		WebElement w1=driver.findElement(By.id("lname"));
		w1.sendKeys(Keys.CONTROL+"v");
		
		

	}

}
