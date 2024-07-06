package class29032024;

class Dataprovider
{
	void username()
	{
		System.out.println("username");
	}
	void password()
	{
		System.out.println("password");
	}
}

public class LogintoAmazon extends Dataprovider
{
	void loign_button()
	{
		System.out.println("login_button");
	}

	public static void main(String[] args) 
	{
		Dataprovider d1=	new LogintoAmazon();//upcasting
		
		d1.username();
		d1.password();
		
		LogintoAmazon d2= (LogintoAmazon)	 d1;
		d2.loign_button();
		d2.username();
		d2.password();
		
		

	}

}
