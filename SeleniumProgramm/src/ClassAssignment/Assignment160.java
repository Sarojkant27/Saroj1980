package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment160 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    WebElement w1 =  driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(w1);
	   //s.selectByVisibleText("Baby");
	    s.selectByValue("search-alias=nowstore");

	}

}
