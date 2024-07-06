package Assignment;

public class Inputa2b3c4Outputaabbbcccc {

	public static void main(String[] args) {
		String str = "aabbbcccc";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				int a = Character.getNumericValue(str.charAt(i));
				for (int j=1;j<a;j++)
				{
					System.out.print(str.charAt(i-1));
				}
			}
		}

	}

}
