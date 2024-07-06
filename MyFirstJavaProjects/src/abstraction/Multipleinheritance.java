package abstraction;

interface parents1
{
 void login(); //by default the access specifier of this method is abstract
 void submit();
  }
interface parents2
{
	void print();
	 
}
public class Multipleinheritance implements parents2,parents1// here we implement two parents class with implement keyword

{
 
 
	public static void main(String[] args) 
	{
		Multipleinheritance m1=new Multipleinheritance();
		m1.login();
		m1.submit();
		m1.print();
		
	}

	public void login()
	{
		System.out.println("login");
		
	}

	public void submit() {
		System.out.println("submit");
		
	}

	public void print() {
		System.out.println("print");
		
	}

}
