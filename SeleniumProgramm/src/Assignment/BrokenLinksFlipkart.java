package Assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksFlipkart {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	    List<WebElement> 	alllinks=driver.findElements(By.tagName("a"));
         int count    =alllinks.size();
		System.out.println(count);
		
		for (int i=0;i<alllinks.size()-1;i++)
		{
			WebElement onelink=alllinks.get(i);
			String attributevalue= onelink.getAttribute("href");
			//System.out.println("The link is " +attributevalue);
			broken_link_list(attributevalue);
		} 
	
	}
	static void broken_link_list(String attributevalue) throws IOException
	{
		try
		{
		URL url1=new URL(attributevalue);
		HttpURLConnection hc=(HttpURLConnection) url1.openConnection();
		hc.connect();
		if (hc.getResponseCode()==200)
		{
			System.out.println("The link is valid");
		
		}
		else
		{
			System.out.println("The link is not valid");
		}
		}
		catch (StaleElementReferenceException e1)
		{
			System.out.println("staleelement handled");
		}
		catch(NullPointerException a1)
		{
			System.out.println("since url was null it was handled");
		}
		catch(MalformedURLException a2)
		{
			System.out.println("since malformedURL was null it was handled");
		}
	}

}
