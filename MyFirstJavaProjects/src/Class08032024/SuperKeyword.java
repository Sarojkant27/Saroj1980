package Class08032024;

class newparent1//Super keyword 
{
	void add()
	{
		System.out.println("i am inside the main method");
	}
}

class child1 extends newparent1
{
	void add()
	{
		//super.add();
		System.out.println("Inside the child ");
		super.add();
	}
}

public class SuperKeyword {

	public static void main(String[] args) 
	{
		child c1=new child();
		c1.add(0);

	}

}
