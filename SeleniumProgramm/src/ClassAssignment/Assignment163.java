package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment163 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    WebElement w1 =  driver.findElement(By.id("searchDropdownBox"));
	    Select s=new Select(w1);
	    s.selectByVisibleText("Books");
	    
	    WebElement w2 =  driver.findElement(By.id("twotabsearchtextbox"));
	    w2.sendKeys("World war");
	    w2.sendKeys(Keys.ENTER);

	}

}
