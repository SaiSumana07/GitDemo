package constructor;

//constructor chaining and this function

public class Test {
	
	Test(){
		this(10);
		System.out.println("Default constructor");
	}
	
	Test(int a){
		this(1,"sjahak");
		System.out.println("1 param constructor");
	}
	
	Test(int a,String s){
		//this(); -recursive constructor call not allowed in java 
		System.out.println("2 param constructor");
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
