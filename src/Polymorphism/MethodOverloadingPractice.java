package Polymorphism;

public class MethodOverloadingPractice {
	
	public void add(int x,int y) {
		int a=x+y;
		System.out.println(a);
	}
	
	public void add(int x,int y,int z) {
		int a=x+y+z;
		System.out.println(a);
	}
	
	public void add(float x,int y) {
		float a=x+y;
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		MethodOverloadingPractice m= new MethodOverloadingPractice();
		m.add(2.5f,4);
		m.add(1, 2,3);
		m.add(1, 827189);
		
	}

}
