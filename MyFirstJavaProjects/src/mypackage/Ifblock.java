package mypackage;

public class Ifblock {

	public static void main(String[] args)
	{
		int age=21;
		int a=23;
		int b=24;
		int c=25;
		if (age>18)
		{
			System.out.println("The condition is true");
		}
		System.out.println("This is outside the if block.");
		if(a>b)
		{
			System.out.println("A is greater than");
		}
		if(a<b)
		{
			System.out.println("B is greater than");
		}
		if(a>=b)
		{
			System.out.println("A is greater than or equals to");
		}
		if(a<=b)
		{
			System.out.println("A is less than or equlas to");
		}
		if(a==b)
		{
			System.out.println("A is equal to");
		}
		if(a!=b)
		{
			System.out.println("A is not equal to");
		}

	}

}
