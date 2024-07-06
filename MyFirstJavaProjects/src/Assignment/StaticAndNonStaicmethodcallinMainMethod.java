package Assignment;

public class StaticAndNonStaicmethodcallinMainMethod {
	//create 5 static method and 5 non static method and call it inside main method
	public static void add()
	{
		System.out.println("This is the add method");
	}
	public static void sub()
	{
		System.out.println("This is the sub method");
	}
	public static void mul()
	{
		System.out.println("This is the mul method");
	}
	public static void div()
	{
		System.out.println("This is the div method");
	}
	public static void mod()// staic method
	{
		System.out.println("This is the mod method");
	}
	
	void add1()
	{
		System.out.println("This is the non staic add method");
	}
	void sub1()
	{
		System.out.println("This is the non static sub method");
	}
	void mul1()
	{
		System.out.println("This is the non static mul method");
	}
	void div1()
	{
		System.out.println("This is the non static div method");
	}
	void mod1()
	{
		System.out.println("This is the non static mod method");
	}
	public static void main(String[] args) 
	{
		StaticAndNonStaicmethodcallinMainMethod s1=new StaticAndNonStaicmethodcallinMainMethod();
		add();
		sub();
		mul();
		div();
		mod();
		s1.add1();
		s1.sub1();
		s1.mul1();
		s1.div1();
		s1.mod1();
		

	}

}
