package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment157 {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.findElement(By.partialLinkText("Customer Service")).click();
		 driver.findElement(By.linkText("Your Orders")).click();
		 

	}

}
