package mypackage;

public class Constrictor {
	
	Constrictor()// constructor
	{
	System.out.println("This is my constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("This is main method");
		Constrictor c1= new Constrictor(); //1st syntax of creating an object 
		new Constrictor(); //2nd way of creating object 

	}

}
