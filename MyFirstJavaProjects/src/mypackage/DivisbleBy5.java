package mypackage;

public class DivisbleBy5 {
//int rem;
	public static void main(String[] args) 
	{
		int rem;
		for(int i=1;i<=100;i++)
		{
			rem=i%5;
			if (rem==0)
			{
				System.out.println(i);
			}
		}

	}

}
