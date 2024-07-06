package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone 15 pro");
		searchbox.sendKeys(Keys.ENTER);
		driver.findElement(By.id("a-autoid-1-announce")).click();
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8080656110");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Udayapur1@");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
		
		
	}

}
