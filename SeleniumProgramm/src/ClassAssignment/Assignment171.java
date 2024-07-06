package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment171 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Saroj");
		driver.findElement(By.id("ap_phone_number")).sendKeys("345234524");
		driver.findElement(By.id("ap_password")).sendKeys("test12");
		driver.findElement(By.id("continue")).click();
		
		

	}

}
