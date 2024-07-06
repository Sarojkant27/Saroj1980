package Assignment;

public class OnemoreObjectforSIBIIBCONMM {
	
	static //SIB
	{
		System.out.println("This is Static Initialization Block");
	}
	{
		System.out.println("This is Instance Initialization Block");
	}
	
	OnemoreObjectforSIBIIBCONMM()
	{
		System.out.println("This is Consturctor");
	}
	public static void main(String[] args) {
		System.out.println("This is Main Method");
		OnemoreObjectforSIBIIBCONMM o1=new OnemoreObjectforSIBIIBCONMM();

	}

}
