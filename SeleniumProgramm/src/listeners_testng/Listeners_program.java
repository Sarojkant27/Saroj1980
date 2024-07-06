package listeners_testng;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class Listeners_program implements ITestListener
{
	static ChromeDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log("Test is starting "); 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test is Pass");	
		TakesScreenshot t1 = driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumProgramm\\src\\Assignment\\"+Math.random()  +"pass.png");
        try {
			FileHandler.copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test is Failed");	
		TakesScreenshot t1 = driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumProgramm\\src\\Assignment\\"+Math.random()  +"failed.png");
        try {
			FileHandler.copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Test is Skipped");	

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		Reporter.log("Test is failed with Timeout");	

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		Reporter.log("Test is yet to start");	

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		Reporter.log("Test is finish");	

	}

	
	
	
}
