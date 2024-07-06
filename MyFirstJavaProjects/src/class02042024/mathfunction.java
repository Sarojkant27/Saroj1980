package class02042024;

public class mathfunction {

	public static void main(String[] args) 
	{
		double pivalue=Math.PI;
		System.out.println(pivalue);
		System.out.println(Math.addExact(100, 50));
		System.out.println(Math.addExact(3000000, 40000));
		System.out.println(Math.subtractExact(1000, 800));
		System.out.println(Math.multiplyExact(5, 5));
		System.out.println(Math.multiplyFull(5, 5));
		System.out.println(Math.multiplyHigh(255634566, 456345633));
		System.out.println(Math.max(24352, 6635354));
		System.out.println(Math.max(5.5, 6.7));
		System.out.println(Math.max(523452345, 353534524));
		for (int i=0;i<=2;i++)
		{
		System.out.println(Math.random());
		}
		System.out.println(Math.sqrt(555));
		System.out.println(Math.decrementExact(23));
		System.out.println(Math.nextDown(5.5));
		System.out.println(Math.nextUp(5.5));
		System.out.println(Math.random());
	}

}
