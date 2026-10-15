package constructor;

public class ChildClass extends ParentClass{
	
	ChildClass(){
		//added by default
		super(1);
		System.out.println("Child constructor");
	}
	
	public static void main(String[] args) {
		new ChildClass();
	}
}
