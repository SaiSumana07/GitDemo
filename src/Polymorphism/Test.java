package Polymorphism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b;
		b= new SBI();
		float sbi=b.getRateOfInterest();
		System.out.println("SBI ROI: "+sbi);
		
		b = new ICICI();
		float icici=b.getRateOfInterest();
		System.out.println("ICICI ROI: "+icici);
	}

}
