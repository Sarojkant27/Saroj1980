package class21032024;

public class Stringconsistsonlyalpha {

	public static void main(String[] args) 
	{
		String name= "Kaniyamuthan1213";
		int length= name.length();
		System.out.println(length);
		int countalpha=0;
		
		boolean answer1;
         	
	
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			answer1=Character.isAlphabetic(a[i]);
			//System.out.println(answer1);
			if (answer1==true)
			{
		countalpha++;
			}
		}
		System.out.println(countalpha);	
		int output= length-countalpha;
		System.out.println(output);
		
		 if (output==0)
		 {
			 System.out.println("Given input consist only with Alpha");}
		 else
		 {
			 System.out.println("Given input not only consist of alpha ");
		 }

	}

}
