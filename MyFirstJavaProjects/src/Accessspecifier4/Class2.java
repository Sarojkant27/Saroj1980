package Accessspecifier4;

import accessspecifier3.Outsidethepackage;

public class Class2 extends Outsidethepackage
{// //what happens outside the package by becoming subclass
	//here we are accessing Outsidethepackage (Accessspecifier3)class outside package with extending 	
	public static void main(String[] args) 
	{
		Class2 c1=new Class2();
		c1.m2();
		c1.m3();

	}

}
