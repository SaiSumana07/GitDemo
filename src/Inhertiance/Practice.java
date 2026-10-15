package Inhertiance;

public class Practice extends Vehichle{
	
	//1.class and objects
	int a=20;
	public void practice() {
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
		Practice p=new Practice();
		System.out.println(p.a);
		new Practice();
		
	//2.Inheritance - example extending vehicle class
		Practice obj=new Practice();
		obj.color();
		obj.engine();
		obj.horn();
		obj.practice();
		
	//3.Explanation of objects access
		//child class obj child class ref- can access both parent and child class properties
		Practice p1=new Practice();
		p1.color();
		p1.horn();
		p1.engine();
		
		//Parent class obj parent class ref- can access parent class methods only
		Vehichle v= new Vehichle();
		v.color();
		//v.practice():
		
		//PArent class ref with child class obj - can access parent class methods only
		Vehichle v1=new Practice();
		v1.color();
		v1.engine();
		//v1.practice();
		
		//Child class ref to parent class obj - cannot create - upcasting
		//Practice p2=new Vehichle();
		
		
	}

}

