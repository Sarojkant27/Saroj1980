package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment158 {
 public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.partialLinkText("Gma")).click();
}
}