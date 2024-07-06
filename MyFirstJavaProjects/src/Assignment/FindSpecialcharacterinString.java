package Assignment;

public class FindSpecialcharacterinString {

	public static void main(String[] args) 
	{
		String str="The Num*&ber1 i/s";
		char[] a=str.toCharArray();
		int letter_count=0;
		int space_count=0;
		int digit_count=0;
		for(int i=0;i<str.length();i++)
		{
			
			boolean b=Character.isAlphabetic(a[i]);
			if(b==true)
			{
				letter_count++;
			}
			
		}
		System.out.println(letter_count);
		for(int i=0;i<str.length();i++)
		{
			
			boolean c=Character.isSpaceChar(a[i]);
			if(c==true)
			{
				space_count++;
			}
			
		}
		for(int i=0;i<str.length();i++)
		{
			
			boolean c=Character.isDigit(a[i]);
			if(c==true)
			{
				digit_count++;
			}
			
		}
		
		System.out.println(str.length()-(letter_count+space_count+digit_count));
	}

}
