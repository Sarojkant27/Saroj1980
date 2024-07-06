package class21032024;

import java.util.Arrays;

public class GivenStringOnlyConsistsAlpha {

	public static void main(String[] args) 
	{
		String name="Saroj1";
		char[] c1=name.toCharArray();
		
		//System.out.println(Arrays.toString(c1));
		int countaplha=0;
		for (int i=0;i<name.length();i++)
		{
			boolean ans=Character.isAlphabetic(c1[i]);
			if (ans==true)
			{
				countaplha++;
			}
		}	
		System.out.println("This is count of the alphabets present "+countaplha);
		if (countaplha==name.length())
		{
			System.out.println("The give string is only alphabet");
		}
		else
		{
		 System.out.println("The give string is not only alphabets");
		}
		
	}

}
