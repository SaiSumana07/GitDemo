package ExceptionHandling;

public class ThowandThrows {
	
	static void validateAge(int age) throws Exception {
		
		if(age>18) {
			System.out.println("You can vote");
		}else {
			System.out.println("You cannot vote");
			throw new Exception();
		}
		System.out.println("Voted successfully");

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		validateAge(12);
	
		
		
	}
}
