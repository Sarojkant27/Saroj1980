package class12032024;

interface parent14
{
 void loign();
 void submit();
}

public class newclass implements parent14
{
 void loign(int a)
 {
	 System.out.println("login inside child");
 }
	public static void main(String[] args) {
		newclass c1=new newclass();
	c1.loign();
	c1.submit();
	c1.loign(5);

	}

	public void loign() {
		System.out.println("loign");
		
	}

	
	public void submit() {
		System.out.println("submit");
		
	}
	
	

}
