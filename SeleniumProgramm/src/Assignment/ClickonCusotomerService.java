package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonCusotomerService {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.partialLinkText("Track packages")).click();
		driver.findElement(By.name("email")).sendKeys("8080656110");
		driver.findElement(By.name("password")).sendKeys("Udayapur1@");
		driver.findElement(By.id("signInSubmit")).click();
	}

}
