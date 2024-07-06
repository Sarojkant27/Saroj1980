package class21032024;


import java.util.Arrays;

public class CopyoneArrayvaluetoOtherArray {

	public static void main(String[] args) 
	{
		
		int number[]=new int[3];
		int num[]=new int[3];
		
		num[0]=23;
		num[1]=24;
		num[2]=53;
		for(int i=0;i<num.length;i++)
		{
			number[i]=num[i];
		}
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(num));
	}

}
