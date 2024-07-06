package mypackage;

import java.util.Scanner;

public class AreaOfCircle_2 {
	
final static double Pi=3.14;
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius");
		double r=s1.nextInt();
		
		double area=(Pi*r*r);
		System.out.println("The area is " + area);
		

	}

}
