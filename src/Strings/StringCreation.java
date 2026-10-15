package Strings;

public class StringCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//By using string literal
		String s1="Sai Sumana";
		String s2="Naveen";
		String s3="Sai Sumana";
		String s4="kiran";
		//JVM check sai sumana in sting constant pool as its already there it wont create a new memeory and instead s3 is referred to same memory object
		
		//By using new keyword- stored in heap unlike string literal new object is created eevery time
		String s=new String("sai suneetha");
		String s5=new String("kiran");
		
		//immutable
		//s1="Amit";
		s1.toLowerCase();
		System.out.println(s1);
		
		//==
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		System.out.println(s1==s5);//false
		System.out.println(s4==s5);//false
		
		//.equals
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s5));//false
		System.out.println(s4.equals(s5));//true
		
		//compareTo
		System.out.println(s1.compareTo(s2));//+5
		System.out.println(s1.compareTo(s3));//0
		System.out.println(s4.compareTo(s));//--8

	}

}
