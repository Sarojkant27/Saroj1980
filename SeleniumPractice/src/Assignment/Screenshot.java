package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement a1 = driver.findElement(By.name("q"));
		a1.sendKeys("bangalore");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='mkHrUc']/div/div/ul/li"));
		int count = auto.size();
		System.out.println(count);
		auto.get(4).click();
		
		
		TakesScreenshot t1 = driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumPractice\\src\\Assignment\\megha.png");
        FileHandler.copy(source,destination);

	}

}
