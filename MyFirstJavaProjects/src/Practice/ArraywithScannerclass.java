package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraywithScannerclass 
{
public static void main(String[] args) 
{
	int number[]=new int[3];
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the number");
	
	for(int i=0;i<number.length;i++)
	{
		number [i]=s1.nextInt();
	}
	System.out.println(number);
	for (int i=0;i<number.length;i++)
	{
		System.out.print(number[i]+ " ");
		
	}
	
	//System.out.println(Arrays.toString(number));
}
}
