package Practice;


public class NofoOccuranceinString {

	public static void main(String[] args) 
	{
		String str="mumbai temsmt";
		int count=1;
		char[] a=str.toCharArray();
		//System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length;i++)
		{
			  count=1;
			for (int j=i+1;j<a.length;j++)
			{
				
				if (a[i]==a[j])
				{
					count++;
					
				}
				
			}
			if(count>1)
			{
				System.out.println(a[i]+" Character occurs "+count+" times in the string");
			}
			else
			{
				System.out.println("No duplcates are present for "+a[i]);
			}
			
			
		}
		
	}

}
