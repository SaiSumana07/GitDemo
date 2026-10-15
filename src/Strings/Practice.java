package Strings;

public class Practice {
	
	public static void main(String[] args) {
		//creation of strings
		//1.String literals - scp check whether sai sumana is there if already there wil reference to same object
		String s="Sai Sumana";
		String s1="Pankaj";
		String s2="Sai Sumana";
		String s3="Pankaj";
		
		//2.String obj using new keyword- every time new memeory is created- stores in heap memeory
		String t=new String("Sai Sumana");
		
		//.equals and ==
		//=== compares address of object 
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s1==s3);
		System.out.println(s==t);
		
		//.equals- compares content
		System.out.println(s1.equals(s3));
		System.out.println(s.equals(t));
		
		//compare to
		System.out.println(s.compareTo(t));
		System.out.println(s.compareTo(s3));
		
		String x="sai sumana Maddirela";
		System.out.println(x.length());
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(x.charAt(4));
		String []s5=x.split(" ");
		for (String string : s5) {
			System.out.println(string);
			
		}
		
		//String buffer and string builder
		String s6="Sai";
		System.out.println("Before concat: "+s6);
		s6.concat("sumana");
		System.out.println("After concat: "+s6);
		
		//String buffer 
		StringBuffer s7=new StringBuffer("Sai");
		System.out.println("Before concat: "+s7);
		s7.append(" sumana");
		System.out.println("After concat: "+s7);
		
		//String builder - non synch - not thread safe
		StringBuilder sb=new StringBuilder("sai");
		sb.reverse();
		System.out.println(sb);
	}

}
