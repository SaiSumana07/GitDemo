package Abstraction;

public abstract class AbstractClass {
	
	abstract void run();
	
	//abstract constructor
	AbstractClass(){
		System.out.println("This is abstract class constructor");
		System.out.println("additional line added to commit to git");
	}
	
	void mileage() {
		System.out.println("mileage is 100 km/l");
	}

}
