package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFBusingIdlocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("skund27@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("xxxxxxx");
		Thread.sleep(4000);
		driver.findElement(By.name("login")).click();
		

	}

}
