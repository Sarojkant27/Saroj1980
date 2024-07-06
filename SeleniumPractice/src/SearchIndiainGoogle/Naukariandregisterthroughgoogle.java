package SearchIndiainGoogle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukariandregisterthroughgoogle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		//driver.findElement(By.id("name")).sendKeys("saroj");
		driver.findElement(By.className("google-text")).click();
		//String parentWindowHandle = driver.getWindowHandle();
	    driver.findElement(By.name("hiddenPassword")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Next")).click();
		
		
	}
	

}
