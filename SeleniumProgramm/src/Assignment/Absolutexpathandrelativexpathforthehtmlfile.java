package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpathandrelativexpathforthehtmlfile {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		//Using the Absoulte xpath
		WebElement ihaveboy=driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		ihaveboy.click();
		WebElement ihavegirl=driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		ihavegirl.click();
		WebElement ihavebabycheckbox=driver.findElement(By.xpath("(/html/body/form/input)[6]"));
		ihavebabycheckbox.click();
		//Thread.sleep(1000);
		WebElement Maleradio=driver.findElement(By.xpath("(html/body/input)[4]"));
		Maleradio.click();
		//Using the Relative xpath
		WebElement submit1=driver.findElement(By.xpath("(//input)[10]"));
		boolean b=submit1.isSelected(); 
		if (b==false)
		{
		submit1.click();
		}
		

	}

}
