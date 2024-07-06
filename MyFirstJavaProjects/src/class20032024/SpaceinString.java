package class20032024;

public class SpaceinString {

	public static void main(String[] args) 
	{
		int i;
		Boolean answer;
		int space_count=0;
		String name="I am %* saroj1";
		char[] c1=name.toCharArray();
		for (i=0;i<name.length();i++)
		{
			answer=Character.isSpaceChar(c1[i]);
			
			if(answer==true)
			{
				space_count++;
			}
		
		}
		
		System.out.println(space_count);
		if(space_count==name.length())
		{
			System.out.println("space only");
		}
		else
		{
			System.out.println("not space only");
		}
		
	}

}
