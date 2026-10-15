package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("Starting execution");
		try {
			int a=20/0;
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("Ending execution");

	}

}
