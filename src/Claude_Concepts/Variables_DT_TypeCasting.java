package Claude_Concepts;

public class Variables_DT_TypeCasting {
	
	public static void main(String[] args) {
		//Primitive data types
		int maxWaitTime=30;
		long responseTime=450000;
		double PassRate=4.5;
		boolean isVisible=true;
		String username="madsa1k";//non primtive but acts like one
		
		System.out.println("Response Time: "+responseTime);
		System.out.println("Wait Time: "+maxWaitTime);
		
		//Type casting 
		//1.String to int 
		String statuscode="200";
		int statuscode_int=Integer.parseInt(statuscode);
		System.out.println("String int: "+statuscode);
		System.out.println("Ineteger code: "+ statuscode_int);
		
		//int to double
		int total=89;
		int passrate=34;
		int average_int=passrate/total;
		System.out.println("Average as integer division: "+average_int);
		double average_double=(double)passrate/total;
		System.out.println("Average as double division: "+average_double);
		
		/*
		 * Practice Exercises
Try these before the mock interview:

Create a variable for each: your name, current year, your QA experience in years (as decimal), and whether you prefer automation over manual.
Store the number "404" as a String, convert it to int, and print the result with a message.
Calculate the defect rate: 12 defects found in 300 test cases. Store as a double and print it as a percentage.
		 */
		
		String name="Sai Sumana";
		int year=2026;
		double yoe=4.5;
		String preference="Automation";
		String statuscode_="404";
		int statuscodeasint=Integer.parseInt(statuscode_);
		System.out.println("Status code is: "+statuscodeasint);
		int noofdefects=12;
		int total_testcases=300;
		double defectrate=(double) noofdefects/total_testcases;
		System.out.println("Defect% :"+defectrate +"%");
		
		/*
		 * Q3 (Hard): In a test automation framework, you're reading test data from a CSV file. All values come in as String. Your test needs to verify that an API response time (also read as String "1250") is less than 2000 milliseconds. Write the Java logic to do this comparison correctly.
		 */
		
		String responsetime="1250";
		int responsetimeasint=Integer.parseInt(responsetime);
		if (responsetimeasint<2000){
			System.out.println("PAss");
		}else {
			System.out.println("Fail");
		}
		

		
	}

}
