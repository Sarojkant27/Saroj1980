package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Highestnumberusingarray {

	public static void main(String[] args) 
	{
		try 
		{
		int number[]=new int[4];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int max= number[0];
		for (int i=0;i<number.length;i++) //if write i<=number.length then exception will happen
		{
		number[i]=s1.nextInt();
		//System.out.println("The numbers are"+number[i]);
		
		if (number[i]>max )
		{
			max=number[i];
		}
	    }
		System.out.println("The max numbers are"+max);
		}
		catch (ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("indexoutofbound handled");
		}

	}

}
