package Assignment;

import java.util.Stack;

public class Legacyproprties {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add(100);
		s1.add(50);
		s1.add("stack");
		s1.add('s');
		
		System.out.println(s1);
		System.out.println("peek method : " +s1.peek());//retrieve 1st element
		System.out.println("push method : " + s1.push(600));//add element
		System.out.println(s1);
		System.out.println("push method : " + s1.push(600));//add element
		System.out.println("pop method : " + s1.pop());//remove last element
		System.out.println("empty method : " + s1.empty());//remove last element

		
		
		/*Enumeration e=s1.elements();
		while(e.hasMoreElements()==true)
		{
			System.out.println(e.nextElement());
		}*/

	}

}
