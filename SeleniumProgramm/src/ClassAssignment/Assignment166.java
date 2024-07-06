package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment166 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		WebElement w=driver.findElement(By.name("Choice4"));
		Select s=new Select(w);
		s.selectByValue("Energy4");
		WebElement w1=driver.findElement(By.name("Choice8"));
		Select s1=new Select(w1);
		s1.selectByValue("QTP8");
		

	}

}
