package mypackage;

public class ifelseifanother {

	public static void main(String[] args) 
	{
		
		int a=21;
		if(a%3==0)
		{
			System.out.println("frog");
		}
		else if(a%5==0)
		{
			System.out.println("cat");
		}
		else if(a%3==0 && a%5==0)
		{
			System.out.println("Thrfrog and cat");
		}
		else
		{
			System.out.println("not divisble");
		}

	}

}
