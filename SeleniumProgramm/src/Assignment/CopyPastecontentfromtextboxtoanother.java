package Assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPastecontentfromtextboxtoanother {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//new code for implicitly wait
		driver.manage().window().maximize();
	WebElement first_name=	driver.findElement(By.id("fname"));
	first_name.sendKeys("saroj");
	first_name.sendKeys(Keys.CONTROL+"a");//select the content from the textbox.
	first_name.sendKeys(Keys.CONTROL+"c");//copy the content from the textbox.
	WebElement last_name=	driver.findElement(By.id("lname"));
	last_name.sendKeys(Keys.CONTROL+"v");//paste the content in the textbox.
		
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//old code for implicitly which is not deprecated
	}

}
