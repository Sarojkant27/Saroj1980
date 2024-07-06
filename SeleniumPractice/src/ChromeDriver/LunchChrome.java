package ChromeDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChrome {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();//It will open the browser
		driver.get("https://www.google.com/");// It will any browser to perticular URL
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();//It will close that perticular tab/parent which have control
		driver.quit();//It will close the parent and child browser /all tabs in the specific browser
		
	}

}
