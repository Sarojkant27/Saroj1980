package TestNG;

import org.testng.annotations.Test;

public class testprogram1 {
	
	@Test
	public void method()
	{
		System.out.println("method");
		//method1();
	}
	@Test
	public static int method1()
	{
		System.out.println("method1");
		return 0;
	}

}
