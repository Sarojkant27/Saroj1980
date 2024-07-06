package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testcase5 {
	
	@Test
	public void testcase1() {
		System.out.println("testcase1");
	}
	@Test
	public void testcase2() {
		System.out.println("Testcase2");
	}
	
	@AfterMethod
	public void testcase5() {
		System.out.println("AM");
	}
	@BeforeSuite
	public void testcase6() {
		System.out.println("BS");
	}
	@BeforeClass

	public void testcase7() {
		System.out.println("BC");
	}
	
		
	@AfterClass
	public void testcase8() {
		System.out.println("AC");
	}
	@BeforeMethod
	public void testcase3() {
		System.out.println("BM");
	}

}
