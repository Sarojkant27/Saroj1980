package class01042024;

class student
{
	void test()
	{
		System.out.println("This is test ");
	}
}

public class Upcasting extends student
{
	
	
	public static void main(String[] args) 
	{
		student s1= new Upcasting();
		s1.test();

	}

}
