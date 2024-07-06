package SearchIndiainGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"));

	}

}
