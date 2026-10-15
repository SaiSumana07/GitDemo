package Abstraction;

public abstract class VZSearchLogin {
	
	abstract void logindetails();
	
	VZSearchLogin(){
		System.out.println("Abstract class constructor");
	}
	
	void loginpagexpath() {
		String searchicon="//div[jahakj]";
		System.out.println(searchicon);
	}

}
