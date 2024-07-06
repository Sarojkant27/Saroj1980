package Assignment;

public class GivenStringonlydigit {

	public static void main(String[] args) 
	{
		String b="43ks2";
		char[] c=b.toCharArray();
		System.out.println(c);
		int digit_count=0;
		for (int i=0;i<b.length();i++)
		{
			boolean d=Character.isDigit(c[i]);
			if (d==true)
			{
				digit_count++;
			}
		}
		
		
		if(digit_count==b.length())
		{
			System.out.println("This string consist of digit");
		}
		else
		{
			System.out.println("This string not consist of digit only ");
		}
	}

}
