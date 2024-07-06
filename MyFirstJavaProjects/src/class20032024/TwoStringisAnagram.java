package class20032024;

import java.util.Arrays;

public class TwoStringisAnagram {

	public static void main(String[] args)
	{
		String a="I am saroj";
		String b="I am saroj";
		
		char[] c1=a.toCharArray();
		char[] c2=b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);
		boolean d=Arrays.equals(c1, c2);
		if(d==true)
		{
			System.out.println("This is anagram");
		}
		else
		{
			System.out.println("This is not anagram");
		}
		
		
		

	}

}
