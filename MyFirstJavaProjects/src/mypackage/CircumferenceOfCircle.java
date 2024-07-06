package mypackage;

import java.util.Scanner;

public class CircumferenceOfCircle 
{

	 final static double Pi=3.14;
	public static void main(String[] args)
	{
		//  int r;
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the radius values");
		int r=s1.nextInt();
		double C=2*Pi*r;
		System.out.println("The Circumference of circle is " + C);
		s1.close();
	}

}
 