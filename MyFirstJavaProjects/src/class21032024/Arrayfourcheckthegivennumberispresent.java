package class21032024;

public class Arrayfourcheckthegivennumberispresent {

	public static void main(String[] args) 
	{
		int number[]=new int[3];
		
		number[0]=12;
		number[1]=14;
		number[2]=6;
		int givennumber=6;
		for (int i=0;i<number.length;i++)
		{
			if(number[i]==givennumber)
			{
				System.out.println("We found the number "+givennumber +" at the index "+i);
			}
			else 
			{
				System.out.println("Sorry the number " + givennumber+ " is not presentat the index " + i );
			}
		}
		
	}

}
