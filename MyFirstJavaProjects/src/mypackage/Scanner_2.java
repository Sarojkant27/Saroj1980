package mypackage;

import java.util.Scanner;

public class Scanner_2 
{
	
	void add()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=s1.nextInt();
		System.out.println("Enter the b value");
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("Sum" +sum);
		//s1.close();			
	}
	
	void sub()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=s1.nextInt();
		System.out.println("Enter the b value");
		int b=s1.nextInt();
		int subtraction=a-b;
		System.out.println("Sub" +subtraction);
		//s1.close();			
	}
	
	void mul()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=s1.nextInt();
		System.out.println("Enter the b value");
		int b=s1.nextInt();
		int mulitiplication=a*b;
		System.out.println("mul" +mulitiplication);
		//s1.close();			
	}
	
	void div()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=s1.nextInt();
		System.out.println("Enter the b value");
		int b=s1.nextInt();
		int division=a/b;
		System.out.println("Div" +division);
		//s1.close();			
	}
	
	void mod()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=s1.nextInt();
		System.out.println("Enter the b value");
		int b=s1.nextInt();
		int modulus=a%b;
		System.out.println("mod" +modulus);
		//s1.close();		
	}
	
   public static void main(String[] args) 
   {

		Scanner_2 s2=new Scanner_2();
		   s2.add();
		   s2.sub();
		   s2.mul();
		   s2.div();
		   s2.mod();
	   
	     
	
   }
}