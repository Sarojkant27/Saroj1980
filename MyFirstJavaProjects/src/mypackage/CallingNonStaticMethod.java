package mypackage;

public class CallingNonStaticMethod 
{
	public int x=5;
	public void sum()
    {
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
    }

	public static void main(String[] args) 
	{
		 		 
	        // Creating object of above class
		 CallingNonStaticMethod g = new CallingNonStaticMethod();
	 
	        // Calling above method to compute sum
	     g.sum();
	     int a = g.x;
	 
	       
	}

}
