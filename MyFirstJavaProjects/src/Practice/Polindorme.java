package Practice;

public class Polindorme 
{

	public static void main(String[] args) 
	{
		String s1="sas";
		String output="";
		for (int i=s1.length()-1;i>=0;i--)
		{
			 output=output+s1.charAt(i);
		}
		System.out.println(output);
		if (output.equals(s1))
		{
			System.out.println("polidorme");
		}
		else
		{
			System.out.println("not polidorme");
		}
		
	}

}
