package accessspecifier;

public class AccessspecifierforstatStaicNonStaticMethod 
{
	
private void m1()
{
	System.out.println("in m1");
}
public void m2()
{
	System.out.println("in m2");
}
protected void m3()
{
	System.out.println("in m3");
}
void m4()
{
	System.out.println("in m4");
}
	public static void main(String[] args) 
	{
		AccessspecifierforstatStaicNonStaticMethod a1= new AccessspecifierforstatStaicNonStaticMethod();
		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();

	}

}
