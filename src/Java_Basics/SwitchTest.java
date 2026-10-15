package Java_Basics;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int exp=1;
		switch (exp) {
		case 1: 
			System.out.println("You are not eligible for VISA");
			break;
		case 2:
			System.out.println("You are eligible for L1");
			break;
		case 3:
			System.out.println("You are eligible for L2");
			break;
		case 4:
			System.out.println("You are eligible for L3");
		
		default:
			System.out.println("You are not allowed to apply");
		}
		*/
		
		int exp=6;
		String technology="db";
		switch (technology) {
		case "automation":
			System.out.println("You can apply for this role");
			switch (exp) {
			case 1:
				System.out.println("Low chances of selection");
				break;
			case 2:
				System.out.println("Mid chances");
				break;
			case 3:
				System.out.println("Very high chances we need 3 years exp");
				break;
			default:
				System.out.println("You are over qualified for us");
			}
			break;
		case "manual":
			System.out.println("You learn automation first");
			break;
		default:
			System.out.println("You are not suitable for this role");
		}
	}

}
