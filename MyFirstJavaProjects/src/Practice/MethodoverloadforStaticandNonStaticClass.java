package Practice;


public class MethodoverloadforStaticandNonStaticClass
{
	public static void sum(int a, int b)   
	{   
	int c=a+b;  
	System.out.println("The sum is: "+c);   
	}   
	//non-static method   
	public void sum(int a)   
	{   
	int c=a;  
	System.out.println("The sum is: "+c);   
	}   
	public static void main(String[] args)
	{
		MethodoverloadforStaticandNonStaticClass c=new MethodoverloadforStaticandNonStaticClass();
		MethodoverloadforStaticandNonStaticClass.sum(5, 6);
		//sum(4, 6);
		c.sum(4, 6);

	}

}

