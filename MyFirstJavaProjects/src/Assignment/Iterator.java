package Assignment;

import java.util.ArrayList;

import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(200);
		a1.add(300);
		a1.add(500);
		a1.add(600);
		ListIterator t=a1.listIterator();
		
		while (t.hasNext()==true)
		{
			System.out.println(t.next());
		}
		while (t.hasPrevious()==true)
		{
			System.out.println(t.previous());
		}
		

	}

}
