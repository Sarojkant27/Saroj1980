package Assignment;

public class NumberPresentinGivenArray {

	public static void main(String[] args) {
		String a="sar6oj3";
		int count=0;
		char[] c=a.toCharArray();
		for (int i=0;i<a.length();i++)
		{
			Boolean d=Character.isDigit(c[i]);
			if (d==true)
			{
				count++;
				System.out.println("It contain number" +c[i]);
			}
			
		}
		System.out.println(count);
	}

}
