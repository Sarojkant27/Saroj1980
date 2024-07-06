package Assignment;

import java.util.Arrays;

public class Arrarytrycatch {

	public static void main(String[] args) 
	{
					
		try
		{
		int number[]=new int[4];
		number[0]=12;	
		number[1]=13;
		number[2]=14;
		number[3]=15;
		//number[4]=15;
		
		System.out.println(Arrays.toString(number));
		}
		catch (ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("exception handled");
		}
		finally {
			System.out.println("We are in the finally block ");
		}
		
	}
}


