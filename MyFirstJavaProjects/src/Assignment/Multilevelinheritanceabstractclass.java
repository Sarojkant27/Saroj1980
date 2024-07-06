package Assignment;
abstract class abc{
	abstract void add();
	abstract void sub();
		
}
abstract class bcd extends abc{
	abstract void mul();
	abstract void div();
	void mod()
	{
		System.out.println("inside the mod");
	}
}
public class Multilevelinheritanceabstractclass extends bcd{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is method");
		Multilevelinheritanceabstractclass m= new Multilevelinheritanceabstractclass();
		m.add();
		m.sub();
		m.mul();
		m.div();
		m.mod();
		m.test();
	}

	@Override
	void mul() {
		// TODO Auto-generated method stub
		System.out.println("this is mul");
	}

	@Override
	void div() {
		// TODO Auto-generated method stub
		System.out.println("this is div");
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("this is add");
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		System.out.println("this is sub");
	}
	void test()
	{
		System.out.println("this is test");
	}

}
