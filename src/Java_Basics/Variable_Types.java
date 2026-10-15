package Java_Basics;

public class Variable_Types {
	
	//static variable
	static int c=30;
	
	//instance variable
	int d=300;
	
	static void method1() {
		//local variable
		int a=20;
		System.out.println(a);
		System.out.println(c);
		//System.out.println(d); cant access directly
		Variable_Types obj=new Variable_Types();
		System.out.println(obj.d);
	}
	
	void method2() { 
		System.out.println(c);//static var can be accessed anywherw
		System.out.println(d);//instance var can be accesed in non static method directly
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//local variable
		int b=10;
		System.out.println(b);
		method1();
		//System.out.println(a); error as local var cant be accessed anywhere outsid ethe mthod
		//static var
		System.out.println(c);
		Variable_Types obj=new Variable_Types();
		System.out.println(obj.d);
	}

}
