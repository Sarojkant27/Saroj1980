package ClassAssignment;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assignment149 {

	public static void main(String[] args) throws InterruptedException {
		SafariDriver driver=new SafariDriver();//It will open the browser
		driver.get("https://www.flipkart.com/");// It will any browser to perticular URL
		Thread.sleep(1000);
		String t1=driver.getTitle();
		System.out.println(t1);
		driver.close();

	}

}
