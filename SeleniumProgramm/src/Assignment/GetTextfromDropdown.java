package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTextfromDropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement dropdown=	driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdown);
		List<WebElement> test =s.getOptions();
		System.out.println(test.size());//to know the count of the value in dropdown using getOptions()
	for (int i=0;i<test.size()-1;i++)
	{
		WebElement count= test.get(i);
		String nameofvalue=count.getText(); //to get the text of the each value in dropdown using getText()
		System.out.println(nameofvalue);
	}
	

	}

}
