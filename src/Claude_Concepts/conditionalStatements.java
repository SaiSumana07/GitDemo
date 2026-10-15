package Claude_Concepts;

public class conditionalStatements {
	
	public static void main(String[] args) {
		int statuscode=200;
		int responsetime=1200;
		if(statuscode==200 && responsetime<2000) {
			System.out.println("API is healthy");
		}else if(statuscode==201 && responsetime<2000) {
			System.out.println("API is fast");
		}else if(statuscode==500) {
			System.out.println("Server error");
		}else {
			System.out.println("unexpected status code: "+statuscode);
		}
		
		String env="uat";
		switch(env) {
		case "dev":
			System.out.println("running on https//:www.dev.com");
			break;
		case "uat":
			System.out.println("running on https//:www.uat.com");
			break;
		case "prod":
			System.out.println("running on https//:www.prod.com");
			break;
		default:
			System.out.println("Invalid env variable please check and input");
		}
//		
//		Q3 (Hard): In your automation framework, you are validating an API response that returns an HTTP status code and a response time. Write Java logic using if-else that:
//
//			Passes if status is 200 or 201 AND response time is under 3000ms
//			Fails with message "slow response" if status is correct but time exceeds 3000ms
//			Fails with message "bad status" if status is anything else
		boolean isValidStatus=(statuscode==200 || statuscode==201);
		if(isValidStatus && responsetime<3000) {
			System.out.println("API is healthy");
		}else if(isValidStatus && responsetime>3000) {
			System.out.println("Slow response");
		}else {
			System.out.println("Bad Status");
		}
		
	}
	
	

}
