package SampleProject;

public class Student {
	String name="Sai Sumana";
	static int [] marks= {78,89,98};
	String result;
	static int total=0;
	double average=0;
	
	static int total_marks() {
	
	for (int i : marks) {
		total=total+i;
	}
	return total;
	}
	
	public void printdetails() {
		System.out.println("Student name: "+name);
		System.out.println("Total marks: "+total);
		average=total/3;
		System.out.println("Average marks: "+average);
		if(average>70) {
			result="Pass";
		}else {
			result="Fail";
		}
		System.out.println("Result: "+result);
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.total_marks();
		s.printdetails();
		
		
		
		
	}
	
	

}
