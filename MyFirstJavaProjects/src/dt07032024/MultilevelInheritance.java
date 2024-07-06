package dt07032024;

class First_Class
{
	static void first()
	{
		System.out.println("parent class");
	}
}
class Second_class extends First_Class
{
	static void second()
	{
		System.out.println("second class that inherits from parent class");
	}
}
class Third_Class extends Second_class

{
	 static void third()
	{
		System.out.println("third class that inherits from second class");
	}
}
class Fourth_Class extends Third_Class
{
	static void fourth()
	{
	System.out.println("this is the Fourth class that inherits from third class");
}
	}

public class MultilevelInheritance extends Fourth_Class
{
	static void fifth()
	{   
		System.out.println("fifth and Final class that inherits from the fourth class");	
	}

	public static void main(String[] args) {
		first();
		second();
		third();
		fourth();
		fifth();
		
		
		

	}

}
