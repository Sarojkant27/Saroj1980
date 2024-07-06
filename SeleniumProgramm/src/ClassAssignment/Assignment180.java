package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment180 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/java/learningHTML1.html");
	 driver.findElement(By.xpath("//input[@name='username']"));
	 driver.findElement(By.xpath("//input[@value='Boy']"));
	 
	 

	}
	
}
