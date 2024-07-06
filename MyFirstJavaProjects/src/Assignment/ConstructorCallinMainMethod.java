package Assignment;

public class ConstructorCallinMainMethod {
	//Create 5 constructor and call it in main method (constructor overloading)
	ConstructorCallinMainMethod()
	{
		System.out.println("First constructor");
	}
	ConstructorCallinMainMethod(int b)
	{
		System.out.println("int constructor");
	}
	ConstructorCallinMainMethod(char b)
	{
		this(4);
		System.out.println("char constructor");
	}
	ConstructorCallinMainMethod(String a )
	{
		this('a');
		System.out.println("String constructor");
	}
	ConstructorCallinMainMethod(boolean a )
	{
		this("saroj");//Using this calling stmt we can also call constructor
		System.out.println("boolean constructor");
	}
	

	public static void main(String[] args) 
	{
		ConstructorCallinMainMethod c1=new ConstructorCallinMainMethod(); // the first constructor will invoked when object created
		//new ConstructorCallinMainMethod(4); //we can call individual constructor by creating object for each 
		//new ConstructorCallinMainMethod('a');
		//new ConstructorCallinMainMethod("saroj");
	   //new ConstructorCallinMainMethod(true);
		//c1.ConstructorCallinMainMethod('a');
		
		
		

	}

}
