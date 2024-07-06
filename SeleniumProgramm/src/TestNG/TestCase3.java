package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 
{
	@BeforeMethod
	void main()
	{
		System.out.println("This is main BM");
	}
	@Test
	public void testcase1()
	{
		System.out.println("This is testcase 1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("This is  testcase 2");
	}
	@Test
	public void testcase3()
	{
		System.out.println("This is  testcase 3");
	}
}
