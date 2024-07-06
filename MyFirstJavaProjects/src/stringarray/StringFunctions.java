package stringarray;

import java.util.Scanner;

public class StringFunctions {
	
	static void reversename()//static method reversename
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter your name");
		String c1=s1.next();
		for (int i=c1.length()-1;i>=0;i--)
		{
			char c=c1.charAt(i);
			System.out.println(c);
		}
		//s1.close();
	}
	static void printname()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter your name");
		String name3=s1.next();
		
		for (int i=0;i<name3.length();i++)
		{
			char c1=name3.charAt(i);
			System.out.println(c1);
		}	
		s1.close();
	}

	public static void main(String[] args) 
	{
	String name="i Saraoj am";
	String name1="Saroj";
	int size=name.length();
	System.out.println(name.chars());
	System.out.println(size);
	System.out.println(name.charAt(3)); //Returns the char value at the specified index of this string.
	System.out.println(name.toUpperCase());
	System.out.println(name.contains(name1));
	System.out.println(name.indexOf('a'));//Returns the index within this string of the first occurrence of the specified character
	System.out.println(name.indexOf("am"));// Returns the index within this string of the first occurrence of the specified substring .
	System.out.println(name.equals(name1));//it returns boolean
	System.out.println("Saroj".equals(name1));
	System.out.println("saroj".equals(name1));
	printname();
	reversename();
			
	
	
	

	}

}
