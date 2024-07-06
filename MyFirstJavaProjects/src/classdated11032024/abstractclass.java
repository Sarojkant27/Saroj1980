package classdated11032024;

abstract class ptest
{
	abstract void login();
	abstract void registratin();
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("add" + c);
	}
	public ptest()
	{
		System.out.println("constructor ");
	}
}
abstract class ttest extends ptest
{
	abstract void multiplication();
	abstract void subtraction();
	void mul()
	{
		super.add();
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("mul" + c);
	}
}

class qtest extends ttest
{
	void mod()
	{
	super.mul();
	int a=10;
	int b=20;
	int c=a%b;
	System.out.println("modulous"+ c);
	}
	void div()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("division"+ c);
	}
	
	void multiplication() 
	{
		System.out.println("mul1");
		
	}
	
	void subtraction() 
	{
		System.out.println("sub1");
		
	}
	
	void login() 
	{
		System.out.println("login1");
		
	}
	
	void registratin() 
	{
		System.out.println("registration1");
		
	}
}
public class abstractclass 
{
	 	
public static void main(String[] args)
{
	qtest a1=new qtest();
	a1.login();
	a1.registratin();
	a1.multiplication();
	a1.subtraction();
	a1.mod();
	a1.div();
	
	
}


}
