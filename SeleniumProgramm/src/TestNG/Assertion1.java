package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	@Test
	public void testcase()
	{
	Assert.assertTrue(false);	
	
	}
	@Test
	public void testcase1()
	{  
	Assert.assertTrue(true);	
	}
	@Test
	public void testcase2()
	{
		Assert.assertFalse(false);	
	}
	@Test
	public void testcase3()
	{
		Assert.assertFalse(true);	
	}
	@Test  //test case will fail
	public void testcase4()
	{
		Assert.assertEquals(false, true); 
	}
	@Test  //test case will fail
	public void testcase5()
	{
		Assert.assertEquals(false, true, "Sorry not matching result"); 
	}
	@Test //test case will pass
	public void testcase6()
	{
		Assert.assertEquals(true, true); 
	}
	@Test //test case will fail (int[],int[])
	public void testcase7()
	{
		Assert.assertEquals(0, 45);
	}
	@Test //test case will pass (int[],int[])
	public void testcase8()
	{
		Assert.assertEquals(45, 45);
	}
	@Test //test case will pass (string,string)
	public void testcase9()
	{
		Assert.assertEquals("google", "google");
	}
	@Test //test case will fail (string,string)
	public void testcase10()
	{
		Assert.assertEquals("Amazon", "google");
	}
	@Test //test case will fail (string,string,string)
	public void testcase11()
	{
		Assert.assertEquals("Amazon", "google", "sorry the title is not matching");
	}
	@Test //test case will fail (string,string,string)
	public void testcase12()
	{
		Assert.assertEquals(25, 24, "Sorry both value is not matching" );
	}
	
	
	
	
}
