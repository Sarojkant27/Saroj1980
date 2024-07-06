package stringarray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseName {

	public static void main(String[] args)
	{
		String reverse="";
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter your Name");
		String name=s1.next(); //Read the input
		
		for (int i=name.length()-1;i>=0;i--)
		{
			char c=name.charAt(i);
			reverse = reverse+c;
		}
		System.out.println(reverse);
		//char[] ch=reverse.toCharArray();
		//System.out.println(Arrays.toString(ch));
		
				
	}

}
