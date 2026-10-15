package Inhertiance;

//4.single level inheritance

public class Practice2 extends Vehichle{
	
	int joiningbonus=200000;
	public static void main(String[] args) {
//		Practice2 p=new Practice2();
//		System.out.println(p.joiningbonus);
//		System.out.println(p.salary);
//		System.out.println("total saalary: "+(p.joiningbonus+p.salary));
		
		//5.multi level inheritance
//		Practice2 p=new Practice2();
//		System.out.println(p.joiningbonus);
//		p.practice();//practice class method
//		p.engine();
//		p.color();//vehichle class methods also we can access
		
		//6.heirachial inheritance- vehichle class is extended in practice as well - like login =func is common so we create seperate class and keep common methods and just extend it to gmail compose or inbox opening page to test
		Practice2 p = new Practice2();
		p.color();
		System.out.println(p.joiningbonus);
		
	}

}
