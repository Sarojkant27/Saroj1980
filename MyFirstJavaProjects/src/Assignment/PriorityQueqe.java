package Assignment;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueqe {

	public static void main(String[] args) {
		PriorityQueue p1= new PriorityQueue();
		p1.add(4);//accept duplicate
		p1.add(4);//doesnot  sorting
		p1.add(4);//not dynamic
		p1.add(500);//do not follow indexing
		p1.add(-1);


		//p1.add(null);//null not accepted
		//p1.add("prior");is not hetrogeneous
		//p1.add('p');
		System.out.println(p1);

		PriorityQueue p2= new PriorityQueue();
		p2.add(5);
		p2.add(0);
		p2.add(-7);
		p2.add(600);
		//Collections.sort(p2);//allow sorting
		System.out.println(p2);

	}

}
