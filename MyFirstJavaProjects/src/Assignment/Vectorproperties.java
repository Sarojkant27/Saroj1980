package Assignment;

import java.util.Vector;

public class Vectorproperties {

	public static void main(String[] args)
	{
		Vector v1=new Vector();
		v1.addElement(100);//accepts null value
		v1.addElement(100);
		v1.addElement(200);
		v1.addElement(null);
		v1.addElement(null);
		v1.addElement("Saroj");
		
		System.out.println(v1);
		
		/*Vector v5 = new Vector();
		v5.add(40);//follow indexing
		v5.add(40);//accept duplicate
		v5.add("vector");//Dynamic nature
		v5.add('v');
		v5.add(null);//accept null
		v5.add(null);
		v5.add(null);
		v5.add(50);//is hetrogeneous
		v5.add(60);
		v5.add(40);//follow indexing
		v5.add(40);//accept duplicate
		v5.add("vector");//Dynamic nature
		v5.add('v');
		v5.add(null);//accept null
		v5.add(null);
		v5.add(null);
		v5.add(50);//is hetrogeneous
		v5.add(60);
        System.out.println(v5);*/

	}

}
