package class20032024;

public class SpecialCharacterInString {

	public static void main(String[] args) 
	{
		int i;
		Boolean answer;
		int space_count=0,alpha_count=0, digit_count=0, specialcharacter_count;
		String name="43ks2";
		char[] c1=name.toCharArray();
		for (i=0;i<name.length();i++)
		{
			answer=Character.isSpaceChar(c1[i]);
			
			if(answer==true)
			{
				space_count++;
			}
		
		}
		for (i=0;i<name.length();i++)
		{
			answer=Character.isAlphabetic(c1[i]);
			
			if(answer==true)
			{
				alpha_count++;
			}
			
		}
		for (i=0;i<name.length();i++)
		{
			answer=Character.isDigit(c1[i]);
			
			if(answer==true)
			{
				digit_count++;
			}
			
		}
		System.out.println("The space present "+space_count);
		System.out.println("The Alphabet present" +alpha_count);
		System.out.println("The digit present "+digit_count);
		specialcharacter_count=name.length()-(space_count+alpha_count+digit_count);
		System.out.println("The Special Character presents " +specialcharacter_count);

	}

}