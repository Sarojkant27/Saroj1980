package Practice;

public class DuplicatevalueinArray {

	public static void main(String[] args) 
	
	{
		String str="This is my world world my";//original string
		String word[]=str.split(" ");//Split the sentense into words
		int count =0;
		System.out.println("The duplicate word in the string is ");	
			  for (int i=0;i<word.length;i++)
			  {
				  
				  for (int j=i+1;j<word.length;j++)
			        {
				     if (word[i].equals(word[j]))
				      {
				       System.out.println(word[i]);
				       	
				      }
			 
				     
			       }
					 
				 
		      }
			  
		
}
}

