package Assignment;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.ListIterator;

public class UpcastingtoTreesettoSet {

	public static void main(String[] args) {
		 Set t1= new TreeSet();
		 //TreeSet t1=new TreeSet();
		 t1.add(100);//doesnot accept duplicate
		 t1.add(500);//does sorting
		 t1.add(0);//donot follow indexing
		 t1.add(-1);//not insertion
		 t1.add(100);//not dynamic
		 t1.add(1000);
		 t1.add(5);
		 t1.add(600);//hashcode
		 
		 //t1.add(null);//not dynamic and not accept null
		 //t1.add("tree");//not hetrogeneous 
		 //t1.add('t');//do not allow string and char

		 System.out.println(t1);
		 
		 Iterator t=t1.iterator();//we can iterate set element by only Iterator
		 while (t.hasNext()==true)
		 {
			 System.out.println(t.next());
		 }
		// ListIterator l=s.iterator();ListIterator is not possible for TreeSet

	}

}
