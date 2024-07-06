package class23032024;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandling2 {

	public static void main(String[] args) {
		try 
		{
			//Scanner s1=new Scanner(System.in);
			
		String c= null;
		if (c.equals("test"))
		{
			System.out.println(c);
		}
		}
			
		catch(ArithmeticException a)
		{
			System.out.println("I have handled one exception called at 1");	
		}
		catch(NullPointerException b)
		{
			System.out.println("I have handled one exception called at 2");	
		}
		catch(InputMismatchException a3)
		{
			System.out.println("I have handled one exception called at IM 3");	
		} 
		
		finally
		{
			System.out.println("we are in finally ");
		}
		
		}

	}


