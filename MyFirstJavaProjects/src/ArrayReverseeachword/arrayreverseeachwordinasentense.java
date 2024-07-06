package ArrayReverseeachword;

public class arrayreverseeachwordinasentense {
//Reverse each word of the sentence 
	public static void main(String[] args) 
	{
		String str="This is my world";//original string
		String[] word=str.split(" ");//Split the sentense into words	
		String reversestring="";
		for (String w:word)
		{
			String reverseword="";
			for (int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			reversestring=reversestring+reverseword+" ";
		}
		
        System.out.println(reversestring);
	}

}
