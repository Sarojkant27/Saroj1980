package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class reversestring {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		String reverse="";
		for (int i=str.length()-1;i>=0;i--)
		{
			
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}

}