package mypackage;

public class Staticexample 
{
	
	static int num=100;
	static String str="saroj";
	
	// This is Static method 
	static void display()
	{
	System.out.println("The number is " +  num);
	System.out.println("The number is " +  str);
	}
	
	// This is non Static method accessing the static method
	
	void nonstatic()
	{
		display();
	}
	
	//main method
	public static void main(String[] args) 
	{
		//objected created
		Staticexample m1=new Staticexample();
		m1.nonstatic();
		
		display();
	}

}
