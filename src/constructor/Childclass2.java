package constructor;

public class Childclass2 extends ParentClass {
	
	Childclass2(){
		super(10);
		System.out.println("child class constructor default");
	}
	
	Childclass2(int a){
		this();
		System.out.println("Child constr 1 param");
	}
	
	static {
		System.out.println("child static block");
	}
	
	{
		System.out.println("child non static block");
	}
	
	public static void main(String[] args) {
		new Childclass2(10);
	}
}
