package Assignment;
import java.util.LinkedList;
public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(100);//it is index based
		l1.add(200);// is store heterogeneous data
		l1.add(300);//store duplicate 
		l1.add(300);//doesn't follow sorting
		l1.add(400);
		l1.add(null);//allow any number null values
		l1.addFirst(23);
		l1.addLast(24);
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		

	}

}
