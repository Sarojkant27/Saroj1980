	package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class Google_autosuggestion1 
{

    public static void main(String[] args) throws InterruptedException, IOException 
    {
        Date currentDate = new Date();
        Date d2=new Date(currentDate.getTime());
        String currentTime = d2.toString().replace(":", "_");
        System.out.println(currentTime);
       // System.out.println(currentTime.substring(0, 4));
      // System.out.println(currentTime.substring(4, 7));
      // System.out.println(currentTime.substring(8, 10));
      // System.out.println(currentTime.substring(11, 19));
      // System.out.println( currentTime.substring(24, 28));
       
       
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("shoe");
        Thread.sleep(1000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div/div/div"));
       // int count = suggestions.size();
        suggestions.get(4).click();
        	
        TakesScreenshot screenshotDriver = driver;
        File source = screenshotDriver.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumProgramm\\Scrrenshot\\"+new Google_autosuggestion1().getClass() +Math.random() +currentTime+"_timestampone.png");
        FileHandler.copy(source, destination);

        driver.quit();
    }

}