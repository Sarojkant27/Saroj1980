package mypackage;

public class NestedIf {

	public static void main(String[] args) 
	{
		int age=16;
		double salary=5000;
		if(age>18)
		{
			if(salary>4000)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
			
		}
		else
		{
			if(age==18)
			{
			System.out.println("age is not equal to 18");	
			}
			else
			{
			System.out.println("age is less than 18");	
			}
		}

	}

}
