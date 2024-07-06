package class21032024;

import java.util.Arrays;

public class CreateOneArrayPrintInReverse {

	public static void main(String[] args) 
	{
		int old[]=new int[3];
		int reverse[]=new int[3];
		old[0]=3;
		old[1]=4;
		old[2]=5;
		int k=reverse.length-1;
		for (int i=0;i<old.length;i++)
		{
			reverse[k] =old[i];
			k--;
			
		}
		System.out.println(Arrays.toString(reverse));
		

	}

}
