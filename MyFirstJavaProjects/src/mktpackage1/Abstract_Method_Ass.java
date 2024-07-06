package mktpackage1;

    abstract class AB {
    	
	abstract void add();
	abstract void sub();
	void login(){
		System.out.println("Login");
	}
}

	abstract class ABB extends AB{
		abstract void div();
		abstract void mul();
		void add() {
			System.out.println("Addition");
		}
		void sub() {
			System.out.println("Subtraction");
		}
		void registration() {
			System.out.println("Registration");
		}
	}
	
public class Abstract_Method_Ass extends ABB
{
    public void username() {
    	System.out.println("Username");
    }
    public static void password() {
    	System.out.println("Password");
    }
    void add() {
    	System.out.println("Addition");
    }
    void sub() {
    	System.out.println("Subtraction");
    }
    void div() {
    	System.out.println("Divide");
    }
    void mul() {
    	System.out.println("Multiply");
    }
    public static void main(String[] args) {
    	Abstract_Method_Ass ama = new Abstract_Method_Ass();
    	ama.username();
    	password();
    	ama.add();
        ama.sub();
        ama.div();
        ama.mul();

	}
}