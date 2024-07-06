package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	private static void staticarry()
	{
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//a[5]=60;//if i assing more value then exceptions error will display
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	private static void dynamicarray()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=s.nextInt();//create one variale size which will store the size of array
		int a[]=new int[size];// created one array and pass the size which will be decided at the run time
		for (int i=0;i<size;i++)//for loop will go less than to size
		{
			a[i]=s.nextInt();//we are inputing the array value one by one into the a[] array.
			
		}
		System.out.println("Printed Array elements");
		for (int i=0;i<size;i++)//for loop will go less than to size
		{
			System.out.print(a[i]+ " ");
			
		}
		
	}

	public static void main(String[] args) {
		
		//staticarry();
		dynamicarray();
		

	}

}
