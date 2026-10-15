package Inhertiance;

public class Car extends Vehichle{
	
	/*
	 * public void color() {
		System.out.println("colr is red");
	}
	
	public void engine() {
		System.out.println("Petrol egine");
	}
	
	public void horn() {
		System.out.println("Press the horn");
	}
	 */
	
	public void brand() {
		System.out.println("Hyundai");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//can access all parent class methods with child object 
		Car c=new Car();
		c.brand();
		c.color();
		c.engine();
		c.horn();
		
		//parent class object cant access methods in child class
		Vehichle v=new Vehichle();
		v.color();
		v.engine();
		v.horn();
		//v.brand();
		
		//Child class object with parent class reference- can access only parent class methods
		Vehichle v1=new Car();
		//v1.brand();
		v1.color();
		v1.horn();
		v1.engine();
		
		//Parent class object with child class reference-cant create
		//Car c1=new Vehichle();
		

	}

}
