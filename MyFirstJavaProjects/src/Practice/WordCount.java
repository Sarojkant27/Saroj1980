package Practice;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the string");
		String str=s.nextLine();
		int count=1;
		for (int i=0;i<str.length();i++)
		{
			if ((str.charAt(i)==' ' && str.charAt(i)!=0))
			{
				count++;
			}
		}
		
System.out.println(count);
	}

}
