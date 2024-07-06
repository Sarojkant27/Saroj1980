 package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectanyvaluebyArrowKeys {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement categroy=driver.findElement(By.id("searchDropdownBox"));
		categroy.click();
		Select s=new Select(categroy);
		
		for (int i=0;i<11;i++)
		{
			categroy.sendKeys(Keys.DOWN);
					
		}
		s.selectByIndex(10);
		driver.findElement(By.id("nav-search-submit-button")).click();
	
	}

}
