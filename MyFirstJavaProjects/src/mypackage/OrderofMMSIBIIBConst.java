package mypackage;

public class OrderofMMSIBIIBConst 
{
	static
	{
		System.out.println("SIB");
	}
	
	{
		System.out.println("IIB");
	}
	
	OrderofMMSIBIIBConst()
	{
		System.out.println("consturctor");
	}
	public static void main(String[] args)
	{
		System.out.println("Main method");
		OrderofMMSIBIIBConst v1=new OrderofMMSIBIIBConst();
		new OrderofMMSIBIIBConst();

	}

}
