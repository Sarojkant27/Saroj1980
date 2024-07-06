package Assignment;

public class AlphabetsPresentinStirngOrNot {

	public static void main(String[] args) {
		String a="Mumbai3456";
		int count =0;
		char [] c=a.toCharArray();
		for (int i=0;i<a.length();i++)
		{
			Boolean d=Character.isAlphabetic(c[i]);
			if (d==true)
			{
				count++;
			}
		}
	}

}
