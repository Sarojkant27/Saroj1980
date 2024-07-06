package class12032024;

interface grantparent1
{
	void login();
	void submit();
	
}

abstract class parents implements grantparent1
{
	abstract void add();
	abstract void sub();
	void cut()
	{
		System.out.println("cut class");
	}
}

public class MultipleInterface extends parents
{
	 void mul()
	 {
		 
		 System.out.println("this is multiiplic");
	 }
	

	public static void main(String[] args) 
	{
		MultipleInterface m1=new MultipleInterface();
		m1.login();
		m1.submit();
		m1.add();
		m1.sub();
		m1.mul();
		m1.cut();
	}


		void add() {
		System.out.println("this is abstract add");
		
	}
		void sub() {
			System.out.println("this is abstract sub");
		
	}
	
		public void login() {
			System.out.println("this is interface login");
			
		}
		
		public void submit() {
			System.out.println("this is interface submit");
			
		}

}
