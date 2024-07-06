package Class08032024;

class newparent//method overriding 
{
	void add(int a)
	{
		System.out.println("i am inside the main method");
	}
}

class child extends newparent
{
	void add(int a)
	{
		//super.add();
		System.out.println("Inside the child ");
	}
} 

public class MethodOverwritting 
{

	public static void main(String[] args) 
	{
		child c1= new child();
		c1.add(10);
		

	}

}
