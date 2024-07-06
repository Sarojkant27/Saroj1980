package TestNG;

import org.testng.annotations.Test;

public class InvocationCount_program
{
@Test(invocationCount=10,priority=-1)
public void method()
{
	System.out.println("method");
}
@Test(enabled=false)
public void method2()
{
	System.out.println("method2");
}
@Test(timeOut=10)
public void method3()
{
	System.out.println("method2");
}

}
