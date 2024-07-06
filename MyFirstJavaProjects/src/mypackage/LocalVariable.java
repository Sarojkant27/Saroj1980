package mypackage;

public class LocalVariable 
{
	
	void add()
	{
		int a=100;
		System.out.println(a);
	}
	void subtract()
	{
		int a=200;
		System.out.println(a);
	}
	void muliplication()
	{
		String a;
		a="My name is saroj";
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		LocalVariable e2=new LocalVariable();
		e2.add();
		e2.subtract();
		e2.muliplication();

	}

}
