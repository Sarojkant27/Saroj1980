package mypackage;

import java.util.*;

public class Scanner_1 {
	
	 int a;
	 int b;
	
	void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	 void sub()
	 {
		 int subtraction=a-b;
		 System.out.println(subtraction);
		 
	 }
	 void mult()
	 {
		 int multi=a*b;
		 System.out.println(multi);
	 }
	 void div()
	 {
		 int division=b/a;
		 System.out.println(division);
	 }
	 void mod()
	 {
		int modulus=a%b;
		System.out.println(modulus);
	 }

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		Scanner_1 s2=new Scanner_1();
		System.out.println("Please enter the value of a");
		s2.a=s1.nextInt();
		System.out.println("Please enter the value of b");
		s2.b=s1.nextInt();
		
						
		s2.add();
		s2.sub();
		s2.mult();
		s2.div();
		s2.mod();
		s1.close();
		

	}

}
