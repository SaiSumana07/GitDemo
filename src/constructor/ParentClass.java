package constructor;

public class ParentClass {
	
	ParentClass(int a){
		System.out.println("Parent class cnstrtucotr");
	}
	
	{
		System.out.println("Parent class non static block");
	}
	
	static{
		System.out.println("Parent class static block");
	}

}
