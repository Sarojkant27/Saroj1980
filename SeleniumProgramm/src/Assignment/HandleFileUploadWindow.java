package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadWindow {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
	WebElement upload=	driver.findElement(By.xpath("//input[@class='file']"));
	
	upload.sendKeys("C:\\Users\\USER\\Pictures\\IMG_7003.JPG");
	}

}
