package ClassAssignment;

import org.openqa.selenium.edge.EdgeDriver;

public class Assignment147 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();//It will open the browser
		driver.get("https://www.flipkart.com/");// It will any browser to perticular URL
		Thread.sleep(1000);
		String t1=driver.getTitle();
		System.out.println(t1);
		driver.close();

	}

}
