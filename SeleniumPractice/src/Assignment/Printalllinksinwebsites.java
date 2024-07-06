package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printalllinksinwebsites {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.co.in/");
		driver.get("https://www.amazon.in/");//use this url to find the id values
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List <WebElement> alllinks=	driver.findElements(By.tagName("a"));
	System.out.println(alllinks.size());
	for (int i=0;i<alllinks.size()-1;i++)
	{
		WebElement a1=alllinks.get(i);
		String URL= a1.getAttribute("href");
		//String idvalue= a1.getAttribute("id");//to get the id values
		//System.out.println(URL);
		//System.out.println(idvalue);// to print the id values
		String linktext=a1.getText();
		System.out.println(linktext +" text of the URL " + URL);
	}
		driver.close();
		
	}

}
