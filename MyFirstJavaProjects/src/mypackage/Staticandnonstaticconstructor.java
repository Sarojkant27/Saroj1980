package mypackage;

public class Staticandnonstaticconstructor {
	public static int add()//static method
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
		return 0;
	}
	
	void substraction()//non static method
	{
	int c=20;
	int d=30;
	System.out.println(d-c);
	}
	Staticandnonstaticconstructor()//constructor
	{
		System.out.println("i am const");
	}
	
     
	public static void main(String[] args) 
	{
		add();//static method can call with method name without creating the object
		Staticandnonstaticconstructor s1=new Staticandnonstaticconstructor();//constructor call when create object
		s1.substraction();//NonStaic method can call through the object
		
	}

}
