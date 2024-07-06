package threadsleep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DifferencebetweenthrowsExceptionThrowable {

	public static void main(String[] args) //throws InterruptedException
	{
		//System.out.println("test");
	//	Thread.sleep(1000);
		//System.out.println("test1");

    try
    {System.out.print("Enter a number :- ");
    	Scanner s = new Scanner(System.in);
     int a =	s.nextInt(); // only digits
    			 // text
    }
//    catch(InputMismatchException e)
//    {
//	System.out.println("i handled the exception");
//    }
//    catch(Exception e)
//    {
//    	System.out.println("i handled exception");
//    }
    catch(Throwable e)
    {
	System.out.println(e.getClass()+" "+"i handled the exception by throwable");
    }
	}

}
