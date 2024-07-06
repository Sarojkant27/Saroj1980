package ArrayReverseeachword;

public class StringFormatter  {
	 

	public static void main(String[] args) 
	{
		String str="This is my world";
		String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words) 
	    {  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord=reverseWord+sb.toString()+" ";
	        //reverseWord+=sb.toString()+" ";  
	    }  
		System.out.println(reverseWord);  
       
	}

}
