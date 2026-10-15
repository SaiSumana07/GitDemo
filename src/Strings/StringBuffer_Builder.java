package Strings;

public class StringBuffer_Builder {
	
	public static void main(String[] args) {
		
		//Strings are immutable
		String s1="Sai Sumana";
		System.out.println("Before concat "+s1);
		s1.concat("Maddirela");
		System.out.println("After concat "+s1);
		
		//String buffer
		StringBuffer sb=new StringBuffer("Sai Sumana");
		System.out.println("Before concat "+sb);
		sb.append(" Maddirela");
		System.out.println("After concat "+sb);
		
		//String Builder
		StringBuilder sd=new StringBuilder("Sai Sumana");
		sd.reverse();
		System.out.println("After reverse "+sd);
		
	}

}
