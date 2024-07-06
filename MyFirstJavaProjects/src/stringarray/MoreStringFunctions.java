package stringarray;
public class MoreStringFunctions {

	public static void main(String[] args) 
	{
		//contains() function
		String a="I am Saroj kanta kund";
				System.out.println(a.contains("Saroj"));
		//Substring function
		//Substring(Initial value), substring (initial value, last index)
		System.out.println(a.substring(5));// from indexing positin 5 to end of the string will be the output 
		System.out.println(a.substring(5, 10));
		//concat function to combine two string
		String b="the student";
		System.out.println(a.concat(b));
		System.out.println(a.concat(" Student")); //give space before S and "
	
	}

}
