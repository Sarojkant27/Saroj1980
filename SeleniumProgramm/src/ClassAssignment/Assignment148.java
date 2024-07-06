package ClassAssignment;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment148 {

	public static void main(String[] args) throws InterruptedException {
		InternetExplorerDriver driver=new InternetExplorerDriver();//It will open the browser
		driver.get("https://www.flipkart.com/");// It will any browser to perticular URL
		Thread.sleep(1000);
		String t1=driver.getTitle();
		System.out.println(t1);
		driver.close();

	}

}
