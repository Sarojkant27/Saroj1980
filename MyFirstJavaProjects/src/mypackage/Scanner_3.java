package mypackage;

import java.util.Scanner;

public class Scanner_3 {
	
	static void add(int a, int b)
	{
		int add= a+b;
		System.out.println(add);
	}
	static void sub(int a, int b)
	{
		int subtraction= a-b;
		System.out.println(subtraction);
	}
	static void mul(int a, int b)
	{
		int mulitiplication= a*b;
		System.out.println(mulitiplication);
	}
	static void div(int a, int b)
	{
		int division= a/b;
		System.out.println(division);
	}
	static void mod(int a, int b)
	{
		int modulus= a%b;
		System.out.println(modulus);
	}
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int c=s1.nextInt();
		int d=s1.nextInt();
				
		add(c, d);
		sub(c, d);
		mul(c, d);
		div(c, d);
		mod(c, d);
		s1.close();
	}
	

}
