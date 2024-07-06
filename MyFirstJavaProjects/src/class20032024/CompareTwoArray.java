package class20032024;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) 
	{
		int number[]=new int[3];
		int number2[]=new int[3];
		number[0]=10;
		number[1]=20;
		number[2]=30;
		number2[0]=45;
		number2[1]=46;
		number2[2]=47;
		
		boolean b1 =Arrays.equals(number, number2);
		System.out.println(b1);
		
	}

}
