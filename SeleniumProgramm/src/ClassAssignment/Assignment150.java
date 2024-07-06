package ClassAssignment;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assignment150 {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();//It will open the browser
		driver.get("https://www.flipkart.com/");// It will any browser to perticular URL
		Thread.sleep(1000);
		String t1=driver.getTitle();
		System.out.println(t1);
		driver.close();

	}

}
