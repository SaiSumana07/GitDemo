package Claude_Concepts;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Arithmetic operators
		int totalcases=100;
		int passed=87;
		int failed=totalcases-passed;
		double passrate= (double) passed/totalcases*100;
		System.out.println("Pass %: "+passrate);
		
		//2.Comparision operatos
		int statuscode=200;
		int responsetime=2200;
		int itemcount=3;
		System.out.println(statuscode==200);
		System.out.println(statuscode!=200);
		System.out.println(responsetime<=2000);
		System.out.println(responsetime>2000);
		System.out.println(itemcount>=2);
		
		//3.Logical Operators
		//and
		if(statuscode==200 && responsetime<2000) {
			System.out.println("Pass and fast load");
		}
		
		//or
		if(statuscode!=201 || responsetime<2000) {
			System.out.println("Pass or medium load");
		}
		
		boolean isAccessible=false;
		if(!isAccessible) {
			System.out.println("You cant enter");
		}
		
		//4.assignment operators shorthand
		int retrycount=0;
		retrycount--;
		retrycount+=2;
		System.out.println(retrycount);
		
		//5.ternary operator
		String result=responsetime<2000 ? "PAss":"Fail";
		System.out.println(result);
		
		
		/*
		 * Exercise 1: Write logic that checks a login response. If status is 200 AND a token is present (boolean hasToken = true), print "Login successful". If status is 401, print "Invalid credentials". Anything else, print "Unexpected error".
Exercise 2: You have a retryCount variable starting at 0. Write a loop-free logic that increments it 3 times using ++ and prints the final value with a message.
Exercise 3: Write a ternary that checks if a button is enabled (boolean isEnabled = false) and stores either "clickable" or "disabled" in a String, then prints it.
		 */
		
		int status_code=200;
		boolean hasToken=true;
		if(status_code==200 && hasToken==true) {
			System.out.println("Login Success");
		}else if(status_code==401) {
			System.out.println("Invalid credentials");
		}else {
			System.out.println("Unexpected Error");
		}
		
		int retryCount=0;
		retryCount++;
		retryCount+=2;
		System.out.println("Retry count value: "+retryCount);
		
		boolean isEnabled=true;
		String result1= isEnabled ? "Clickable":"Disabled";
		System.out.println(result1);
		
		String s1="Sai";
		String s2="Sai";
		String s3=new String("Sai");
		System.out.println(s1==s2);//true as string constants are stored in pool and refer to same object if value is same
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true as content is checked not address
		
	}
}
