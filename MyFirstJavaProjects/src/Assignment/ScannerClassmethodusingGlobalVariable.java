package Assignment;

import java.util.Scanner;

public class ScannerClassmethodusingGlobalVariable {
	static int a;
	static int b;
	void add()
	{
		int c=a+b;
		System.out.println("The addition is " +c);
	}
	void sub()
	{
		int c=a-b;
		System.out.println("The subtraction is " +c);
	}
	void mul()
	{
		int c=a*b;
		System.out.println("The multiplicatoin is " +c);
	}
	public static void div()
	{
		int c=a-b;
		System.out.println("The division is " +c);
	}
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		ScannerClassmethodusingGlobalVariable s2=new ScannerClassmethodusingGlobalVariable();
		System.out.println("Please enter the value of a");
		ScannerClassmethodusingGlobalVariable.a=s1.nextInt();
		System.out.println("Please enter the value of b");
		ScannerClassmethodusingGlobalVariable.b=s1.nextInt();
		
		
		s2.add();
		s2.sub();
		s2.mul();
		ScannerClassmethodusingGlobalVariable.div();
		

	}

}
