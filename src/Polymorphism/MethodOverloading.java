package Polymorphism;

public class MethodOverloading {
	
	static void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	static void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	
	static void add(int a,float b) {
		float c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		add(1,2);
		add(1,2,3);
		add(1,4.3f);
	}
}
