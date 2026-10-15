package constructor;

public class MyTest {
	//instance variable
	int a;
	
	//this is how a default constructor looks like we can create it manually ourself to assign values whenever we want our code to be executed at time of object creation
	MyTest(){
		a=20;
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor called at time of object creation
		//MyTest t=new MyTest();
		//we use the reference var of class to call the variable - jvm defaults it to 0 as no value is there
		//System.out.println(t.a);
		
		//if we just create object - default constructor is called
		new MyTest();
		

	}

}
