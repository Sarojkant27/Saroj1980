package listeners_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)
public class Youtube_search_NarendraModi extends Listener
{
	@Test
	public void Search_NarendraModi_youtube() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement	w1=driver.findElement(By.name("search_query"));	
		w1.sendKeys("Narendra Modi" );
		w1.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[22]")).click();
	//WebElement w2=	driver.findElement(By.cssSelector("ytd-subscribe-button-renderer"));
	WebElement w2=	driver.findElement(By.xpath("//*[contains(@aria-label, \"Subscribe\")]"));
		Actions a1=new Actions(driver);
		a1.click(w2).build().perform();
		
	}
	    

}

