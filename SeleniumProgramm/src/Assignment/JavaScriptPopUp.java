package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {

     ChromeDriver driver=new ChromeDriver();
     driver.get("https://grotechminds.com/javascript-popup/");
     driver.findElement(By.xpath("//button[.='Click ']")).click();//birth to the javascript
     Thread.sleep(2000) ;
     driver.switchTo().alert().accept();//handle the javasript
     

	}

}
