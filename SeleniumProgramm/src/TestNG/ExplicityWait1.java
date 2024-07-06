package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.findElement(By.className("btnjs")).click();
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));  
		//w1.until(ExpectedConditions.titleIs("saroj"));
	//	w1.until(ExpectedConditions.alertIsPresent());
		w1.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		

	}

}
