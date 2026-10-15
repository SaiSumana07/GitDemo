package Java_Basics;

public class VoidMethod {
	
	void login() {
		System.out.println("Login Success");
	}
	
	static void login1() {
		System.out.println("successful login");
	}
	
	static int add() {
		int a=20;
		return a;
	}
	
	String add1() {
		System.out.println("inside st");
		String a="sai sumana";
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// throws error as non static method login();
		VoidMethod ref=new VoidMethod();
		ref.login();
		ref.login1();
		login1();//can be called directly as static method
		ref.add();
		System.out.println("Result -> "+add());
		System.out.println("Result -> "+ref.add1());
	}

}
