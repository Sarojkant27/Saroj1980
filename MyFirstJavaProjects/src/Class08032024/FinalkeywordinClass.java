package Class08032024;

 /*final*/ class parents
{
	void add() 
	{
		System.out.println("parent calss");
	}
}
class childs extends parents
{
	void add()
	{
		
		System.out.println("child class");
	}
}

public class FinalkeywordinClass {

	public static void main(String[] args)
	{
		System.out.println("This is the main method");
		childs c1=new childs();
		c1.add();

	}

}
