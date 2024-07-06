package Practice;

public class ReversetheGivenNumber {

	public static void main(String[] args) {
		int arr[]= {3,4,5};
		System.out.println("The original number");
		for (int i=0;i<arr.length;i++)
		{
			int b=arr[i];
			System.out.print(b);
		} 
		System.out.println(" ");
		System.out.println("The reverse number");
		for (int i=arr.length-1;i>=0;i--)
		{
			int c=arr[i];
			System.out.print(c);
		}
		
	}

}
