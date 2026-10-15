package Java_Basics;

import java.util.Iterator;

public class Practice {
	static int x = 3;
	int y = 2000;

	void example() {
		int b = 20;
		int c = b + y;
		System.out.println(c);
	}

	static void login() {
		System.out.println("this is static methof");
		// System.out.println(y);
	}

	int add() {
		int a = 20;
		System.out.println("Return type");
		return a;
	}

	public static void main(String[] args) {
		/*
		 * System.out.println("Hi hello"); int String=20;//not reccomended Practice
		 * p=new Practice(); p.example(); login(); p.add(); System.out.println(p.add());
		 * System.out.println(x); System.out.println(p.y);
		 * 
		 * for (int i = 10; i >0; i--) { System.out.println("Hello world in for loop");
		 * }
		 * 
		 * int []a= {1,2,3,4,6}; for (int i : a) { System.out.println(i); }
		 */

		/*
		 * int abc=5;
		 * 
		 * while(abc<5) { System.out.println(abc); abc++; }
		 * 
		 * 
		 * do { System.out.println(abc); abc++; }while(abc<5);
		 */
		
	/*	int age=11;
		if(age>18) {
			if(age>60) {
				System.out.println("You are senor citizen");
			}else {
				System.out.println("You are npt senior");
			}
			System.out.println("You can vote");
		}
		else if(age>10){
			System.out.println("You can watch a movie instead");
		}else {
			System.out.println("You cant vote");
		}

	}*/
		String role="ajhakj";
		int yoe=3;
		switch(role) {
		case "automation":
			switch(yoe) {
			case 1:
				System.out.println("very less exp you cant");
				break;
			case 2:
				System.out.println("medium exp apply next year");
				break;
			case 3:
				System.out.println("you can apply");
				break;
			case 4:
				System.out.println("you are over eligible");
				break;
			default:
				System.out.println("YOE not matched please check and apply");
			}
			break;
		case "manual":
			System.out.println("Please upskill");
			break;
		default:
			System.out.println("You are not eligible for this role");
		}
	
	}
		
}
