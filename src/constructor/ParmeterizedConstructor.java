package constructor;

public class ParmeterizedConstructor {
	
	int a=10;
	
	ParmeterizedConstructor(int num){
		a=num;
	}
	
	public static void main(String[] args) {
		//new ParmeterizedConstructor(); - will throw an error as JVM will not call the default constructor
		ParmeterizedConstructor t=new ParmeterizedConstructor(100);
		System.out.println(t.a);
	}
	

}
