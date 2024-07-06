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
        String currentTime = d2.toString();
        System.out.println(currentTime);
        System.out.println(currentTime.substring(0, 4));
       System.out.println(currentTime.substring(4, 7));
       System.out.println(currentTime.substring(8, 10));
       System.out.println(currentTime.substring(11, 19));
       System.out.println( currentTime.substring(24, 27));
       
       
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Mumbai");
        Thread.sleep(1000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
        
        int count = suggestions.size();
        suggestions.get(count - 4).click();
        
        TakesScreenshot screenshotDriver = driver;
        File source = screenshotDriver.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumPractice\\src\\Assignment\\"
                + new Google_autosuggestion1().getClass()+ Math.random() + "_"+currentTime.substring(0, 4) +":" + currentTime.substring(4, 7)+"saroj.png");
        FileHandler.copy(source, destination);

        driver.quit();
    }

}