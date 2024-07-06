package class18032024;

public class Replace {

	public static void main(String[] args) 
	{
		String name="I am Saroj9845";
		
		String output= name.replace('a', '0');//replace with 0
		System.out.println(name.replace('a', ' '));//replace with space
		System.out.println(name.replace('a', 'n'));//replace with n
		String output1=name.replaceAll(name, output);
		System.out.println(output);
		System.out.println(output1);
		System.out.println(name.replaceAll("[A-Z]","")); //remove alp letter
		System.out.println(name.replaceAll("[a-z]","")); ///remove smaller letter
		System.out.println(name.replaceAll("[0-9]","")); //remove numbers
		System.out.println(name.replaceAll("[A-Z]","Manish"));//replace capital letter with Manish
		String name3="";
		System.out.println(name.isEmpty());
		System.out.println(name3.isEmpty());
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.equalsIgnoreCase("I am Saroj9845"));
		System.out.println(name.repeat(5));
	//args..cle
		String s1="Saroj";
		System.out.println(s1.toString());
	
		
    
	}

}
