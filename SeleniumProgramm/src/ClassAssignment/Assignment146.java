package ClassAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment146 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();//It will open the browser
		driver.get("https://www.flipkart.com/");// It will any browser to perticular URL
		Thread.sleep(4000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
