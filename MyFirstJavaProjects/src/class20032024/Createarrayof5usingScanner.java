package class20032024;

import java.util.Arrays;
import java.util.Scanner;

public class Createarrayof5usingScanner 
{

	public static void main(String[] args) 
	{
		int number[]=new int[5];
		int i;
		System.out.println("Plese enter the number");
		Scanner s1=new Scanner(System.in);
		for (i=0;i<number.length;i++)//to take the user input for array
		{
		number [i]=s1.nextInt();
				   
		}
		/*for (i=0;i<number.length;i++)//display the array
		{
		System.out.println((number [i]));
		}*/
		//System.out.println(number [3]);
		String c= Arrays.toString(number);
        System.out.println(c);
        s1.close();
	}

}
