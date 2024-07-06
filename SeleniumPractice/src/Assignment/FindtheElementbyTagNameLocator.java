package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindtheElementbyTagNameLocator {
 
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		WebElement e=d.findElement(By.tagName("button"));
		boolean b1=e.isDisplayed();
		boolean b2=e.isEnabled();
		if(b1 && b2)
		{
			e.click();
		}

	}

}
