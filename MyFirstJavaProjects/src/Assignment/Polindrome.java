package Assignment;

import java.util.Scanner;

public class Polindrome {
//check Palindrom input Scanner Class
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter the Namme");
		String input=s1.nextLine(); // Read user input
		String output="";
		s1.close();
		for (int i=input.length()-1;i>=0;i--) //backward decrement
		{
			char rev=input.charAt(i); //character of i
			output=output + rev;
						
		}
		System.out.println(output);
		
		if (input.equals(output))
		{
			System.out.println("polindrome");
		}
		else
		{
			System.out.println("not polindrome");
		}

	}

}
