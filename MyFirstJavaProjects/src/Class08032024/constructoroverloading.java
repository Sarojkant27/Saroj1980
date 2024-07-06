package Class08032024;

public class constructoroverloading //this()calling statement
{
	constructoroverloading(int a)
	{
		//this('c');  
		System.out.println("1");
	}
	
	constructoroverloading(char a)
	{
		//this("Manish");
		this(5);
		System.out.println("2");
	}
	
	constructoroverloading(String b)
	{
		//this(true);
		this('c');
		System.out.println("3");
	}
	constructoroverloading(boolean a)
	{
		//this(100,false,"Hello");
		this("kund");
		System.out.println("4");
	}
	constructoroverloading(int a, boolean b, String c)
	{
		this(true);
		System.out.println("5");
	}
	public static void main(String[] args)
	{
		new constructoroverloading(5, true, "saroj");//one object for 1 constructor 
	
	}

}
