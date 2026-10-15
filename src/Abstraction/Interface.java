package Abstraction;

public interface Interface {
	
	void run();
	abstract void speed();
	
	
	//void mileage() {} - interfaces cannot have body for methods
	//Interface(){} - interfaces cannot have constructors
	//we can have private method but it can never be used as interfaces cannot have objects
	//private void mileage() {};
	//static method we can have - but it can never be executed as interface cant have objects 
	/*static void method() {
		System.out.println("sai sumana");
	}
	*/ 
}
