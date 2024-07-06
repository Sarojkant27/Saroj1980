package class14032024;

public class String_Class {

	public static void main(String[] args)
	{
		String name="Saroj"; 
		String name1="I am saroj";
		int size=name.length(); 
		System.out.println(size);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(4));// name.charAt(int index) Returns the character at the specified index (position) 4
		System.out.println(name.indexOf('r'));// name.indexOf(int ch)to find out the index of "o"  in the given string
	//System.out.println(name.indexOf('ro'));
		System.out.println(name1.indexOf("saroj"));//the index of the first occurrence of the specified substring,or -1 if there is no such occurrence.
		System.out.println(name.equals(name1));//Return type of equal method is boolean
		System.out.println("saroj".equals("saroj"));
		System.out.println(name.equals("saroj"));//false because s is in lower case 
		System.out.println(name.equals("Saroj"));//true because S is in upper case of the string
		System.out.println("-------------");
		for (int i=0;i<name.length();i++)
		{
			System.out.println(i);
		}
		System.out.println("-------------");
		for (int i=0;i<name.length();i++)
		{
			
			char a1=name.charAt(i);
			System.out.println(a1);
		}
		System.out.println("-------------");
		for (int i=name.length()-1;i>=0;i--)
		{
		    char a1=name.charAt(i);
			System.out.println(a1);
		}
		System.out.println("-------------");
		
	}

}
