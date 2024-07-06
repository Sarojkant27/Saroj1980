package class20032024;

import java.util.Arrays;

public class CountOfDigit {

	public static void main(String[] args) 
	{
		int i;
		Boolean answer;
		int count_number=0;
		String name="Sar3oj1";
		char[] a1=name.toCharArray();
		System.out.println(Arrays.toString(a1));
		for (i=0;i<name.length();i++)
		{
			 answer=Character.isDigit(a1[i]);
			System.out.println(answer);
		
		if (answer==true)
		{
			count_number++;
		}
		}
		System.out.println("The number of digit in the given string is "+count_number);
	}

}
