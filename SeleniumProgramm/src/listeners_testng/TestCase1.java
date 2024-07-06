package listeners_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;

@Listeners(Listeners_program.class)
public class TestCase1  extends Listeners_program
{
	
@Test
public void test_case_drag_drop() throws InterruptedException
{
	 driver=new ChromeDriver();
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
  Assert.assertTrue(false);
}
}
