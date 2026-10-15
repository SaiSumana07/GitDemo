package Strings;

public class StringMethods {
	
	public static void main(String[] args) {
		String s1="sai sumana is in hyderabad.";
		
		//length of string
		System.out.println(s1.length());
		
		//upper and lower case
		System.out.println(s1.toUpperCase());
		System.out.println("HELLO".toLowerCase());
		
		//char at
		System.out.println(s1.charAt(26));
		
		//spilt
		String [] s2= s1.split(" ");
		for(String ref:s2) {
			System.out.println(ref);
		}
	}

}
