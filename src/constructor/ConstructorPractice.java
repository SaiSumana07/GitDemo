package constructor;

public class ConstructorPractice {
	
	int a;
	
	//default constructor 
	
	//user defined default 
	/*
	 * ConstructorPractice(){ a=20; System.out.println("Defualt constructor"); }
	 */
	
	//parameterized ocnstructor
	/*
	 * ConstructorPractice(int a){ this.a=a; System.out.println("Hello"); }
	 */
	
	//constructor overloading
	//constrcutor chaining 
//	ConstructorPractice(){
//		this(1);
//		System.out.println("default constr");
//	}
//	
//	ConstructorPractice(int a){
//		this(1,2);
//		System.out.println("1 param constr");
//	}
//	
//	ConstructorPractice(int a,int b){
//		//this();
//		System.out.println("2 param constr");
//	}
//	
	
	ConstructorPractice(int a){
		System.out.println("Parent class constructor");
	}
	
	{
		System.out.println("Parent class non static block");
	}
	
	static {
		System.out.println("Parent class static block");
	}
	public static void main(String[] args) {
		
		//constructor call upon creating object
		//ConstructorPractice obj=new ConstructorPractice();
		//System.out.println(obj.a);
		
		//we can call constr any number of times but if reference points to old constructor call it shows older value itself
//		ConstructorPractice obj=new ConstructorPractice(100);
//		new ConstructorPractice(1000);
//		System.out.println(obj.a);
		
		//constructor overloading call
//		 new ConstructorPractice();
//		 new ConstructorPractice(1,2);
//		 new ConstructorPractice(1);
		
		//this function and constructor chaining
		//new ConstructorPractice();
		
		//static non static
		new ConstructorPractice(10);
	}

}
