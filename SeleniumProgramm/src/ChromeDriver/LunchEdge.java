package ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class LunchEdge {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.close();

	}

}
