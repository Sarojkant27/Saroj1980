package ChromeDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.opera.OperaDriver;

public class LunchOpera {

	public static void main(String[] args) {
		SafariDriver driver=new SafariDriver();
		//System.setProperty("webdriver.opera.driver", "C:\\Users\\USER\\AppData\\Local\\Programs\\Opera\\opera.exe");
		//OperaDriver driver = new OperaDriver();
		driver.get("https://www.google.com/");
		driver.close();

	}

}
