package mypackage;


class Employee
{  
	 float salary=40000;  

}  
/*class Programmer extends Employee
{  
	 int bonus=10000; 
}*/
public class Inheritance2 extends Employee
{
	
	void test()
	{
		 int bonus=10000; 
	}
	public static void main(String[] args) 
	{
		Inheritance2 p=new Inheritance2();  
		p.test();
		
		//System.out.println("Programmer salary is:"+p.salary);  
		  // System.out.println("Bonus of Programmer is:"+p.bonus);  

	}

}
