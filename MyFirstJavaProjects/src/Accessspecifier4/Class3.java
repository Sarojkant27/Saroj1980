package Accessspecifier4;

import accessspecifier3.Outsidethepackage;

public class Class3 {//what happens outside the package without becoming subclass
//here we are accessing Outsidethepackage (Accessspecifier3)class outside package without extending the 	
	

	public static void main(String[] args)
	{
		Outsidethepackage O1=new Outsidethepackage(); 
		O1.m2();

	}

}
	