package Polymorphism;

public class MethodOeverridingPractice extends Parent{
	
	public void marry() {
		System.out.println("I will marry the boy i like");
	}
	
	public static void main(String[] args) {
		MethodOeverridingPractice x= new MethodOeverridingPractice();
		x.marry(); //child class override parent class
		
		Parent obj = new Parent();
		obj.marry();
		
		Parent p=new MethodOeverridingPractice();
		p.marry(); //child class method overrides parent class implementation 
	}

}
