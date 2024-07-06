 package Assignment;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    WebElement drag_element=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
	    WebElement drop_element=driver.findElement(By.xpath(" (//div[@id='div2'])"));
	   Actions a1=new Actions(driver);
	   a1.dragAndDrop(drag_element, drop_element).perform();
	   Thread.sleep(1000);
	   WebElement drag_element1=driver.findElement(By.xpath(" (//div[@id='div2'])"));
	   WebElement drop_element1=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
	   Actions a2=new Actions(driver);
	   a2.dragAndDrop(drag_element1, drop_element1).perform();
	   //Thread.sleep(1000);
	  // driver.close();
	   

	}

}
