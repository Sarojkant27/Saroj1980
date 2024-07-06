package Practice;

import java.util.Scanner;

public class SumofThreeDigit {

	public static void main(String[] args) {
		int a=243;
		int sum;
		int digit;
		
		//while (a>0)
		for (sum=0;a!=0;a=a/10)
		{
			//digit=a%10;// while loop
			//sum=sum+digit; // while loop
			sum=sum+a%10;
			//a=a/10;// while loop
		}
		
		System.out.println("The sum is " +sum);

	}

}
