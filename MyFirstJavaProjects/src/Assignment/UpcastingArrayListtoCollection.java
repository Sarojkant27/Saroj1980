package Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UpcastingArrayListtoCollection {

	public static void main(String[] args) {
		 Collection c=new ArrayList();
		 c.add(10);//alows duplicate
		 c.add(10);//follow indexing
		 c.add("saroj");//is hetrogenious
		 c.add(null);//allow null
		 c.add(null);//follow indexing
		
		System.out.println(c.contains(10));
		 System.out.println(c);
		// Collections.sort(c);;
		 
		 Collection d=new ArrayList();
		 d.add(10);
		 d.add(10);
		 d.add("saroj");
		 d.add(null);
		 d.add(null);
		 c.addAll(d); 
		//Collections.sort(d);//not allowed
		 
		 
;
	}

}
