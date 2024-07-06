package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class custoerm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    driver.findElement(By.linkText("Customer Service")).click();
	    driver.findElement(By.xpath("//div[@class='a-column a-span9 ss-rich-card-column-text a-span-last']")).click();

	}

}
