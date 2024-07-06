package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRAProgramm1 implements IRetryAnalyzer{

	int initial_count=0;
	
	int retry_count=2 ;
	@Override
	public boolean retry(ITestResult result) {
		
		for (int i=initial_count;i<retry_count;)
		{
			initial_count++;
			return true;
		}
		return false;
	}
	
	

}
