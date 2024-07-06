package Assignment;

public class CheckSpeciacharacterinaString {
	public static void main(String[] args) {
		String a= "What$% is this";
		int specialcharcount=0;
		int k=0;
		int f=0;
		int g=0;
		char b[]=a.toCharArray();
		for (int i=0;i<a.length();i++)
		{
		boolean	 bc=Character.isAlphabetic(b[i]);
			if (bc==true)
			{
				k++;
			}
			
		}
		
		for (int i=0;i<a.length();i++ )
		{
			boolean d=Character.isDigit(b[i]);
			if (d==true)
			{
				f++;
			}
		}
		
		for (int i=0;i<a.length();i++)
		{
			boolean d=Character.isSpaceChar(b[i]);
			if (d==true)
			{
				g++;
			}
		}
			
		specialcharcount = a.length()-(k+f+g);
		System.out.println(specialcharcount);
	}

}
