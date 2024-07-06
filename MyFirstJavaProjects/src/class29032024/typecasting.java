package class29032024;

public class typecasting {

	public static void main(String[] args) 
	{
		double weight=83;//implicitly
		System.out.println(weight);
		
		double weight1=(double) 83;////explicitly
		System.out.println(weight1);
		
		int weight3=(int) 83.45;////narrowing
		System.out.println(weight3);
		
		double a=93.40;
		int weight4= (int) a;
		System.out.println(weight4);

	}

}
