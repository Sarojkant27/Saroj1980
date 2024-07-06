package classdated11032024;

abstract class higer
{
 abstract void login();
 abstract void registration();
 void add()
 {
	 int a=10;
	 int b=20;
	 int c=a+b;
	 System.out.println("addition" + c);
 }
}

abstract class lower extends higer
{
	abstract void anything();
	abstract void something();
	void subtraction()
	{
		super.add();
		int a=10;
		 int b=20;
		 int c=a-b;
		 System.out.println("addition" + c);
		
	}
}

class morelower extends lower
{
	void multiplication()
	{
		super.subtraction();
		int a=10;
		 int b=20;
		 int c=a*b;
		 System.out.println("multiplication" + c);
	modulus();	 
		 
	}
	void modulus()
	{
		int a=10;
		 int b=20;
		 int c=a%b;
		 System.out.println("modulous" + c);
	}
	
	void anything() {
		System.out.println("anything");
		
	}
	
	void something() {
		System.out.println("something");
		
	}
	
	void login() {
		System.out.println("login");
	}
	
	void registration() {
		System.out.println("registration");
		
	}
}

public class MultilevelInheritanceAbstractClass{ //extends morelower{

	public static void main(String[] args) 
	{
		
	morelower ml=new morelower();
		ml.anything();
		ml.something();
		ml.login();
		ml.registration();
		ml.multiplication();
		
		//ml.modulus();
		
		//MultilevelInheritanceAbstractClass c1=new MultilevelInheritanceAbstractClass();
	
		
	
		

	}

}
