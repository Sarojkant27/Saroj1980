package SearchIndiainGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtoSearchvalueintext {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("https://www.naukri.com/Indiandia");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		//driver.close();

	}

}
