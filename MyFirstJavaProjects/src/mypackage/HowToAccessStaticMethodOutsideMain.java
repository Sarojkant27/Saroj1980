package mypackage;

public class HowToAccessStaticMethodOutsideMain {
	
	static void add()
	{
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println(add);
	}
	
	static void subtractin()
	{
		int a=10;
		int b=20;
		int sub=b-a;
		System.out.println(sub);
	}
	
	static void multiplicaton()
	{
		int a=10;
		int b=20;
		int mul=a*b;
		System.out.println(mul);
	}
	static void division()
	{
		int a=10;
		int b=20;
		int div=a/b;
		System.out.println(div);	
	}
    public static void main(String[] args)// Main method
    {
		System.out.println("Main Method");
		add(); 
		subtractin();
		multiplicaton();
		division();
	}

}
