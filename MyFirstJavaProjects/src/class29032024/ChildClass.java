package class29032024;
class grantparent
{
	void add()
	{
		System.out.println(5+6);
	}
}

class parentclass extends grantparent
{
	void sub()
	{
		System.out.println(5-6);
	}
}

public class ChildClass extends parentclass
{
void mul()
{
	System.out.println(5*6);
}
	public static void main(String[] args)
	{
		parentclass p1 =	 new ChildClass(); //upcasting 
		parentclass p2 =(parentclass)	 new ChildClass(); //upcasting explicity 
		p1.add();
		p1.sub();
		ChildClass c1=(ChildClass) p1;
		c1.add();
		c1.sub();
		c1.mul();
	
		

	}

}
