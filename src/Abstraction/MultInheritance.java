package Abstraction;

public class MultInheritance implements Branding,Login {

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login page");
		
	}

	@Override
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println("Gmail");
		
	}
	
	public static void main(String[] args) {
		MultInheritance t=new MultInheritance();
		t.brand();
		t.login();
	}

}
