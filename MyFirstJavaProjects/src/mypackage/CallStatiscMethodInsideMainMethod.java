package mypackage;

public class CallStatiscMethodInsideMainMethod {
	 static void add()
	 {
		 int a=10;
		 int b=20;
		 System.out.println(a+b);
	 }

	public static void main(String[] args) 
	{
		CallStatiscMethodInsideMainMethod c1=new CallStatiscMethodInsideMainMethod();
		add();
		
	}

}
