package mypackage;
import java.util.*;
public class Program_ScannerClass 
{
	
	int a; 
	int  b;
	
	void add()
	{
		int sum=a+b;
		System.out.println("sum="+sum);
		
	}
	void sub()
	{
		
		int subtraction=a-b;
		System.out.println("sub="+subtraction);
	}
	void multi()
	{
		int multiplication=a*b;
		System.out.println("mul="+multiplication);
	}
	void div()
	{
	
		int division=a/b;
		System.out.println("div="+division);
	}
	void modulus()
	{
		int mod=a%b;
		System.out.println("mod="+mod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						Scanner s1=new Scanner(System.in);

	}

}