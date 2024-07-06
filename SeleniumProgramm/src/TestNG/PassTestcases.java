package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PassTestcases {
	
	@Test
	public void testcase1()//Fail the test case
	{
		Assert.assertTrue(false);
	}
	@Test
	public void testcase2()//pass the test case
	{
		Assert.assertTrue(true);
	}

}
