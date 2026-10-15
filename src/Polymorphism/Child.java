package Polymorphism;

public class Child extends Parent {
	
	
	void marry() {
		System.out.println("You will marry B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.marry();//overrides parent class marry emthod
		
		Parent p = new Parent();
		p.marry();
		
		Parent p1= new Child();
		p1.marry();//overrides parent class marry for upcasting as well
	}

}
