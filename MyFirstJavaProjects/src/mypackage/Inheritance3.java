package mypackage;

class mentor
{
	static void add()
	{
		System.out.println("add");
	}
}


public class Inheritance3 extends mentor
{
  static void sub()
  {
	  System.out.println("sub");
  }
	public static void main(String[] args) 
	{
		sub();
		add();

	}

}
