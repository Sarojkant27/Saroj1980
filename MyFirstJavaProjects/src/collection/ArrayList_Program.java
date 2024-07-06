package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Program 
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList(6);//add(Object e)
		a1.add("saroj");
		a1.add(456);
		a1.add(34);
		a1.add(4.5);
		a1.add(null);
		a1.add(234324234);
		a1.add("saroj");
		System.out.println(a1);
		
		ArrayList a2= new ArrayList();
		a2.add(456);
		a2.add(460);
		a2.add(459);
		a2.add(6445);
		a2.add(934);
		a2.add(234);
		a2.add(500);
		Collections.sort(a2);
		System.out.println(a2);
		//a2.addAll(a1);
		//System.out.println(a2);
		Collections.sort(a2,Collections.reverseOrder()); //reverse sorting
		System.out.println(a2);
		
		
		  

	}

}
