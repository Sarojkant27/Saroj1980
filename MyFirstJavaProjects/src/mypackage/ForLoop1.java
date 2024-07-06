package mypackage;

public class ForLoop1 {

	public static void main(String[] args) throws InterruptedException 
	{
		for (int i=1;i<11;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);//sleep the output for 1 second
			//i++;
			
		}

	}

}
