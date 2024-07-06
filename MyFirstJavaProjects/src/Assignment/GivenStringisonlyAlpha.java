package Assignment;

public class GivenStringisonlyAlpha {

	public static void main(String[] args) {
		String b="Sarojretwre";
		char[] c=b.toCharArray();
		int character_count=0;
		boolean d;
		for (int i=0;i<b.length();i++)
		{
			
			d=Character.isAlphabetic(c[i]);
			if (d==true)
			{
				character_count++;
			}
		}
		System.out.println(character_count);
		
		if (character_count==b.length())
		{
			System.out.println("The string consists only Alpha");
		}
		else
		{
			System.out.println("The string consists only Alphanumeric");
		}
		
		
	
	}

}
