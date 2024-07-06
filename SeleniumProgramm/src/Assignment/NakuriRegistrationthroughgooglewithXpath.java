package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class NakuriRegistrationthroughgooglewithXpath {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.xpath("(//span)[.='Google']")).click();

	}

}
