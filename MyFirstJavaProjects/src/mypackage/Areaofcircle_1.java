package mypackage;

import java.util.Scanner;

public class Areaofcircle_1 {
	
	final static double Pi=3.14;
	static int s1;
	void circle()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the radius values");
		int r=s1.nextInt();
        double Area= (Pi*r*r);
		System.out.println("The Area of circle is " + Area);
		//s1.close();
	}
	public static void main(String[] args) 
	{
		Areaofcircle_1 o1=new Areaofcircle_1();
		
		for(int i=1;i<11;i++)
		{
			
			o1.circle();	
		
		
		}
		
	}
	//s1.close();
}
