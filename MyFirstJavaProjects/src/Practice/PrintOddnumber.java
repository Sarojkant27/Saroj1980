package Practice;

public class PrintOddnumber {

	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8};
		
		for (int i=0;i<arr.length-1;i++)
		{
			if (arr[i]%2!=0)
			{
				System.out.println("The is  Odd number " + arr[i]);
			}
		}

	}

}
