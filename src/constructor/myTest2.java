package constructor;

//constructor overloading - same name diff parameter list compiler decided which one to call at compile time 
public class myTest2 {
	
	myTest2(){
		System.out.println("Default constructor");
	}
	
	myTest2(int a){
		System.out.println("1 param constr");
	}
	
	myTest2(int a,int b){
		System.out.println("2 param constr");
	}
	
	myTest2(String a,int b){
		System.out.println("2 param constr with diff data types");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new myTest2();
		new myTest2("Sumana",25);
		new myTest2(1,2);
		new myTest2(2000);
	}

}
