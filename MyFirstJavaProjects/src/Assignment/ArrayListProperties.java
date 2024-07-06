package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListProperties {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add("Saroj");
		al.add("Saroj");
		al.add(true);
		al.add(8.34);
		al.add('s');
		al.add(null);
		al.add(null);
		//al.remove(4);
		//al.removeAll(al);
		//al.addAll(al)
		System.out.println(al.size());
		
		System.out.println(al.get(3));
		al.set(3, "sk");
		System.out.println(al.get(3));
		System.out.println(al);
		
		Iterator t=al.iterator();
	
		while (t.hasNext()==true)
		{
			System.out.println(t.next());
		}
		
		
		System.out.println(al);
		
		ArrayList a2=new ArrayList();
		
		a2.add(100);
		a2.add(200);
		a2.add(300);
		a2.add(-90);
		
		//a2.containsAll(al);
		System.out.println(a2.containsAll(al));
		System.out.println(a2.contains(300));
		//al.removeAll(a2);
		//System.out.println(al);
		Collections.sort(a2);
		//a2.clear();
		System.out.println(a2);
		//a2.addAll(al);
		//System.out.println(a2);
		Collections.sort(a2,Collections.reverseOrder());
		System.out.println(a2);
		
		
	}
}
	



