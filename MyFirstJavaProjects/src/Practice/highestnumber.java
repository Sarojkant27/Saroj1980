package Practice;

public class highestnumber {

	public static void main(String[] args) 
	{
		int arr[] = {54, 13, 1, 10, 34, 12};
	     int max = arr[0];
	     for(int i=0; i<arr.length; i++)
	     {
	    	 
	       if(arr[i] >max  )
	       {
	          max = arr[i];
	          
	       }
	     }
	    System.out.print(max); 

	}
	
}
