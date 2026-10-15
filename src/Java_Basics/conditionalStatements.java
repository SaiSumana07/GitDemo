package Java_Basics;

public class conditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // simple if
		int age=5;
		if(age>18) {
			System.out.println("You can enter the bar");
		}
		
		
		//if else
		if(age>18) {
			System.out.println("You can enter the bar");
		}else {
			System.out.println("You cannot enter the bar");
		}
		
		//nested if
		if(age>18) {
			System.out.println("You can enter the bar");
			if(age>21) {
				System.out.println("You can drink");
			}else {
				System.out.println("You cannot drink");
			}
		}else {
			System.out.println("You cannot enter the bar");
			if(age>12 && age<18) {
				System.out.println("You can watch a movie instead");
			}
		}
		
		//if else if
		if(age>18) {
			System.out.println("You can enter the bar");
		}else if(age>12 && age<18) {
			System.out.println("You can watch a movie");
		}else {
			System.out.println("Go home");
		}

	}

}
