package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderinTestNG {
	@DataProvider(name="data1")
	public Object data()
	{
		return new Object [][] {{"mobile"},{"pen"},{"laptop"},{"camera"}};
	}
	@DataProvider(name="data2")
	public Object data1()
	{
		return new Object [][] {{11},{13},{14},{16}};
	}

	@Test(dataProvider="data1")
	public void search(String input)
	{
		System.out.println(input);
	}
	@Test(dataProvider="data2")
	public void search(int digit)
	{
		System.out.println(digit);
	}
}
