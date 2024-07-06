package class12032024;

interface langauge {
	void java();
	void javascript();
	void ruby();

}
interface testtool 
{
	void selenium();
}

/*class multilangaue 
{
	void python()
	{
		System.out.println("its python");
	}*/

	

public class Interfacemultiple  implements testtool
{
	 
	public static void main(String[] args) 
	{
		Interfacemultiple m1=new Interfacemultiple();
		m1.java();
		m1.javascript();
		m1.ruby();
		m1.selenium();
		//m1.python();

	}

	public void java() 
	{
		System.out.println("jave method ");
		
	}

	
		
	public void ruby() 
	{
		System.out.println("ruby method ");
		
	}

	
	public void selenium() 
	{
		System.out.println("selenium method ");
		
	}

	
	public void javascript() {
		System.out.println("javescript method ");
		
	}
	
		
	}


