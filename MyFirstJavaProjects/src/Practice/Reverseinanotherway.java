package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Reverseinanotherway {

	public static void main(String[] args) 
	{
		String reverse="";
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String name=s.next();
	char[] ch=name.toCharArray(); //converting the string to new character array
	for (int i=ch.length-1;i>=0;i--)
	{
		 reverse=reverse+ch[i];
		 
	}
	//System.out.println(reverse);
	//char[] ch1=reverse.toCharArray();
	System.out.println(Arrays.toString(ch));
	if (reverse.equals(ch))
	{
		System.out.println("polindrome");
	}
	else
	{
		System.out.println();
	}
	}

}
