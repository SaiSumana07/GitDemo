package ExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		System.out.println("Start");
		
		try {
			int a=20/0;
		}catch(Exception e) {
			System.out.println(e);
			System.exit(0);
		}
		finally {
			System.out.println("This will execute always");
		}
		
		System.out.println("End");

	}

}
