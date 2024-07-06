package Practice;

import java.util.Scanner;

public class NumberofOccurence2 {

	public static void main(String[] args) 
	{
		int a1[]=new int[256];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		for (int i=0;i<str.length();i++)
		{
			int rev=str.charAt(i); 
		}
		for (int i=0;i<256;i++)
		{
			if(a1[i]!=0)
			{
				System.out.println((char)i + "-->"+ a1[i]);
			}
		}
		
	}

	
	

}
