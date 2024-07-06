package class20032024;

import java.util.Arrays;

public class FindNumberinstring {

	public static void main(String[] args)
	{
		String name="Sa3oj1";
		char[] a1=name.toCharArray();
		System.out.println(Arrays.toString(a1));
		for (int i=0;i<name.length();i++)
		{
		Boolean answer1=Character.isDigit(a1[i]);
		//System.out.println(answer1);
		if (answer1==true)
		{	
			
		System.out.println("number present in index "+ i);
		}
		}
	}

}
