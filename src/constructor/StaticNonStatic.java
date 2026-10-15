package constructor;

public class StaticNonStatic {

	{
		System.out.println("Non static block");
	}
	
	static {
		System.out.println("Static block");
	}
	
	public static void main(String[] args) {
		new StaticNonStatic();
		new StaticNonStatic();
		new StaticNonStatic();
	}
}
