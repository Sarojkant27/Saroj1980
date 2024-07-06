package TestNG;

import org.testng.annotations.Test;

public class ManyClassesProgramm {

		@Test(groups={"smoke"})
		public void testcase1()
		{
			
		}

		@Test (groups={"smoke","system"})
		public void testcase2()
		{
			
		}

		@Test (groups={"Regression","system"})
		public void testcase3()
		{
			
		}

		@Test (groups={"Regression","system"})
		public void testcase4()
		{
			
		}

		@Test (groups={"Regression","system"})
		public void testcase5()
		{
			
		}
}
