package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpcastingArraylisttoList {

	public static void main(String[] args) {
		 List al=new ArrayList();
		al.add(100);
		al.add(17);
		 al.add(500);
		 al.add(12);
		// al.add(null);
		// al.add(null);
		 System.out.println(al);
		 Collections.sort(al);//sorting is not allowed while upcasting arrylist to list
		 System.out.println(al);
		 

	}

}
