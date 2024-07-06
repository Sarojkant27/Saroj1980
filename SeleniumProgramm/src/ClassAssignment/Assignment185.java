package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment185 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
//		String pid= driver.getWindowHandle();
//		Set<String> pandcid= driver.getWindowHandles();
//		Iterator<String> pc= pandcid.iterator();
//		String parentid= pc.next();
//		String childid= pc.next();
//		driver.switchTo().window(childid);
//		WebElement fn=driver.findElement(By.xpath("(//input[@name='firstname'])[1]"));
//       boolean b =fn.isDisplayed();
//		System.out.println(b);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"u_3_b_nz\"]")).sendKeys("saroj");
		driver.findElement(By.name("lastname")).sendKeys("kund");
		driver.findElement(By.name("reg_email__")).sendKeys("434343434");
		driver.findElement(By.name("reg_passwd__")).sendKeys("password@");
		driver.findElement(By.name("birthday_day")).click();
		
		

	}

}
