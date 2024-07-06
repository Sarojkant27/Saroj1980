package class20032024;

import java.util.Arrays;

public class CountOfAlphabet {

	public static void main(String[] args) 
	{
		int i;
		boolean answer;
		int alpha_count=0;
		String name="Saroj1";
		char[] c1=name.toCharArray();
		
		for (i=0;i<name.length();i++)
		{
			answer=Character.isAlphabetic(c1[i]);
			
			if (answer==true)
			{
				alpha_count++;
			}
		
		}
		System.out.println("The alphabets in the string is "+alpha_count);
		
	}

}
