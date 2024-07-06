package dt07032024;

class grandparentclass
{
	
	{
		System.out.println("grandparents IIB constructor");
	}
}
class superclass extends grandparentclass
{
	static void add()
	{
		System.out.println("parent clsss method");
	}
}

public class child_class extends superclass
{
	static void test()
	{
		System.out.println("child class method");
	}
	void mul()
	{
		System.out.println("non static child method");
	}

	public static void main(String[] args) 
	{
		test();
		add();
		//child_class c1=new child_class();
		//c1.mul();

	}

}
