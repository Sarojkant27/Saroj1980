package class21032024;

import java.util.Arrays;

public class AfterCopythearraycheckequalornot {

	public static void main(String[] args) 
	{
		int number1[]=new int[3];
		int number2[]=new int[3];
		number1[0]=23;
		number1[1]=24;
		number1[2]=25;
		for (int i=0;i<number1.length;i++)
		{
			number2[i]=number1[i];
		}
		System.out.println(Arrays.toString(number2));
		System.out.println(Arrays.toString(number1));
		System.out.println(Arrays.equals(number2, number1));
	}

}
