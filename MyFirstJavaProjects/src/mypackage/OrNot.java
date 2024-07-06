package mypackage;

public class OrNot {

	public static void main(String[] args) 
	{
		int age = 20, sal= 70000;
		if (age>10)
		{
			System.out.println("1");
		}
		if (age>10 && sal>8000)
		{
			System.out.println("2");
		}
		if(!(age>10 || sal>8000))
		{
			System.out.println("3");
		}

	}

}
