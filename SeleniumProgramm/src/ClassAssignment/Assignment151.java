package ClassAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment151 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("gmail");
		driver.findElement(By.name("btnK")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

	}

}
