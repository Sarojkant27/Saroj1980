package mypackage;

class one
{
	 //int a=ture;
	public void sub()
	{
		two.add();
		System.out.println("test sub");
	}
	
}
class two
{
   public static void add()
	{
		
	   System.out.println("test add");
	}
}

public class AdditingTwoNumber {
	static int a;
	void sub()
	{
		a=5; 
		//int a;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		
		AdditingTwoNumber c1=new AdditingTwoNumber();
		c1.sub();
		
		

	}

}
