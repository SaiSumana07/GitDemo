package ExceptionHandling;

public class NestedTryCatch {
	
	public static void main(String[] args) {
		try {
			int a=20/1;
			System.out.println("Entered 1st try block");
			try {
				int b=20/0;
				System.out.println("Entered 2nd try block");
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Exiting sub try block");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Exited main try block");
		
		
		try {
			int x=20/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}catch(Throwable e) {
			System.out.println(e);
		}
	}
	

}
