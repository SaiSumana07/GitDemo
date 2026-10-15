package constructor;

public class superkeywordpractice extends ConstructorPractice{
	superkeywordpractice(){
		//super() - JVM provides this
		super(10);
		System.out.println("Child class default constructor");
	}
	
	superkeywordpractice(int a){
		//super() - JVM provides this
		this();
		System.out.println("Child class 1 param constructor");
	}
	
	{
		System.out.println("Child class non static block");
	}
	static
	{
		System.out.println("Child class static block");
	}
	
	public static void main(String[] args) {
		//by default parent class constructor is called
		//if we define any paremetrized constr then we have to explicitly call
		new superkeywordpractice(10);
	}
}
