package dt07032024;

class parent_class
{
	static void mul()
	{
		System.out.println("parents class");
	}
	
}

public class Inheritance_2 extends parent_class
{
	static void add()
	{
		System.out.println("new test");
	}
	
public static void main(String[] args) 
{
	add();
	mul();

}

}
