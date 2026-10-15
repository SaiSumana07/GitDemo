package Java_Basics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for loop
		
		for(int i=0;i<10;i++) {
			System.out.println("Login Failed");
		}
		System.out.println("*");
		for(int i=10;i>0;i--) {
			System.out.println("Login Failed");
		}
		
		
		//for each loop
		String []a= {"sai","sumana","maddirela"};
		for(String ref:a) {
			System.out.println(ref);
		}
		
		int [] b= {1,2,3,4,5,6,7,8,9};
		for(int ref:b) {
			System.out.println(ref);
		}
		
		//while loop
		int value=2;
		while(value>1) {
			System.out.println("Hello");
			value--;
		}
		
		//do while loop
		do {
			System.out.println("Always Run");
			value--;
		}while(value>1);

	}

}
