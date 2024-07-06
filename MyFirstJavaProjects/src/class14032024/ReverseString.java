package class14032024;
public class ReverseString {

	public static void main(String[] args) 
	{
		String str="Saroj";
		//for(int i=4;i>=0;i--)
		for (int i=str.length()-1;i>=0;i--)
		{
			char a1=str.charAt(i);
			System.out.println(a1);
		}

	}

}
