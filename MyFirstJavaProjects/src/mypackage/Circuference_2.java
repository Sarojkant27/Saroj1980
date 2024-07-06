package mypackage;

import java.util.Scanner;

public class Circuference_2 {

	public static void main(String[] args) 
	{
		int radius;
	      double circumference;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the radius of the circle ::");
	      radius = sc.nextInt();
	      circumference = Math.PI*2*radius;
	      System.out.println("Circumference of the circle is ::"+circumference);

	}

}
