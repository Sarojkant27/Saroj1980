package Assignment;

import java.util.Scanner;

public class PolindromeNumber {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=input.next();
		String rev="";
		for (int i=str.length()-1;i>0;i--)
		{
			 rev=rev+input;
		}
		System.out.println("");
 if(rev.equals(str))
 {
	 System.out.println("The stirng is Polindorme");
 }
 else
 {
	 System.out.println("The stirng is not Polindorme");
 }
	}

}
