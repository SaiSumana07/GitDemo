package Abstraction;

public class AbsTest extends AbstractClass {

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("please run");
		System.out.println("additional line added to commit to git");
		
	}
	
	public static void main(String[] args) {
		//AbstractClass n=new AbstractClass();
		AbstractClass t= new AbsTest();
		t.run();
		t.mileage();
	}
}
