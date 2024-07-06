package class27032024;
 class login
{
	private String email_id="skund@gmail.com" ;//default 
	public String getemail_id()
	{
		return email_id;
	}
	public void setemail_id(String email_id)//local vaiable
	{
		this.email_id=email_id;
	}
	private String password="contact@gmail.com";
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	private int age=18;
	public int getage()
	{
		return age;
	}
	public int setAge(int age)
	{
		return this.age= age;
		 
	}
	
	
}

public class encapsulation 
{

	public static void main(String[] args) 
	{
		
		login l1=new login();
		l1.setemail_id("test@test.com");
		System.out.println(l1.getemail_id());
		
		l1.setPassword("newtest@gmail.com");
		System.out.println(l1.getPassword());
		
		l1.setAge(24);
		System.out.println(l1.getage());
		
		
		
	}

}
