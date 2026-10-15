package Abstraction;

public class InterfaceTest implements VZSearchLoginPage,MainPage{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Login page");
		
	}
	
	public static void main(String[] args) {
		InterfaceTest t = new InterfaceTest();
		t.login();
		t.loginmainpage();
	}

	@Override
	public void loginmainpage() {
		// TODO Auto-generated method stub
		System.out.println("Main Search login page");
		
	}

}
