package Abstraction;

public class InterfacetTest implements Interface {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run fast");
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("speed is 1000kmph");
		
	}
	
	public static void main(String[] args) {
		InterfacetTest t=new InterfacetTest();
		t.run();
		t.speed();
	}

}
