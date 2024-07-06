package Practice;

public class Input123456Output1238056 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		for (int i=0;i<a.length-1;i++)
		{
			if (a[i]==5)
			{
				a[i]=10;
				int x=a[i+1];
				
			}
			System.out.println(a[i]);
		}
		
		
	}

}
