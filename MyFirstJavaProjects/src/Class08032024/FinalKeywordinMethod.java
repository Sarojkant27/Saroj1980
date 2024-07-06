package Class08032024;

class newparent3//method overriding 
{
	final void add()
	{
		System.out.println("i am inside the main method");
	}
}

class child3 extends newparent3
{
	void sub()
	{
		//super.add();
		System.out.println("Inside the child ");
	}
}

public class FinalKeywordinMethod {

	public static void main(String[] args)
	{
		child3 c1=new child3();
		c1.add();
		c1.sub();

	}

}
