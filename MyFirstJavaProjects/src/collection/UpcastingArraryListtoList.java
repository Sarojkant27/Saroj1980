package collection;

import java.util.ArrayList;
import java.util.List;


public class UpcastingArraryListtoList {

	public static void main(String[] args) 
	{
	List l1=	  new ArrayList();//Upcasting the ArrayList child class object to List parent class type
	l1.add("1234");
	l1.add(12345);
	
	l1.add(null);//it is dynamic in nature
	l1.add(null);//null can add manytimes
	l1.add(755);
	System.out.println(l1);
	
	

	}

}
