package class15032024;
public class StringFunction
{
	public static void main(String[] args) 
	{
		String i="    I am student";
		boolean answer3= i.contains("student"); //returns boolean when contain any or all 
		System.out.println(answer3);
		String answer4=i.substring(4); 
		System.out.println(answer4);
		System.out.println(i.substring(7));
		System.out.println(i.substring(3, 12));
		System.out.println(i.concat(" Saroj"));
		
		System.out.println(i.trim());

	}

}
