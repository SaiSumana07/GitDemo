package Inhertiance;

public class C extends A,extends B{
	
	//multiple inhertiance- not possible as two methods have same name in diff classes compliler will have ambiguity 
	//and diamond problem

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.m1();

	}

}
