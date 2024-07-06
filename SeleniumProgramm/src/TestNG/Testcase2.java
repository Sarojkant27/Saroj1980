package TestNG;

import org.testng.annotations.Test;

public class Testcase2 {

	@Test
	public void method()
	{
		System.out.println("method");
	}
	@Test
	public void method1()
	{
		System.out.println("method1");
		method2();
	}
	@Test
	public static int method2()
	{
	 System.out.println("method2");
	return 0;
			
	}
}
