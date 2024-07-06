package ArrayReverseeachword;

import java.util.Arrays;

public class Reverseeachwordinstring {

	public static void main(String[] args)
	{
		String words="This is india";
		String words1[]=words.split(" ");
	    String word1="";
	    String word2="";
	   
		System.out.println(words);
		String s=words1[0];
		String s1=words1[1];
		System.out.println(s);
		char[] a=s.toCharArray();
		System.out.println(Arrays.toString(a));
		char[] a1=s1.toCharArray();
		System.out.println(Arrays.toString(a1));
		for(int i=a.length-1;i>=0;i--) {
		   word1=word1+s.charAt(i);
			
				}
		System.out.println(word1);
		for(int i=a1.length-1;i>=0;i--) {
			   word2=word2+s1.charAt(i);
				
					}
			System.out.println(word2);
	        String reverse=(word1.concat(" "));
	        System.out.println(reverse.concat(word2));

}
}
