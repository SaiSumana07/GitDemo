package Inhertiance;

public class Tester extends Employee{
	
	//single level inheritance
	
	int joiningbonus=2000000;
	
	public static void main(String[] args) {
		Tester t=new Tester();
		System.out.println("Joining bonus :"+t.joiningbonus);
		System.out.println("Salary :"+t.salary);
	}

}
