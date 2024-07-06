package Assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionmethod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement categroy=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(categroy);
	    List<WebElement> sizeofthedropdown=	s.getOptions();
		System.out.println(sizeofthedropdown.size());
	}

}
