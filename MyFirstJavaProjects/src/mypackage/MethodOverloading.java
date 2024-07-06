package mypackage;

public class MethodOverloading 
{

		int add()
		{
			System.out.println("addition");
			return 0;
		}
		void add(int a)
		{
			System.out.println(a);
		}
		void add(int a, double b)
		{
			System.out.println(a+b);
		}
		void add(double a, int b)
		{
			System.out.println(a+b);
		}
		static void add(String a, int b, double c)
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
		
	public static void main(String[] args) 
	{
		add("saroj", 100, 98.23);
		MethodOverloading e1=new MethodOverloading();
		e1.add(100,23.13);
		e1.add(0.9, 11);
		e1.add();
		e1.add(5);

	}

}
