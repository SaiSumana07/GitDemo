package Inhertiance;

public class Hyundai extends Car{
	
	//multi-level inheritance
	
	public void hyundaimileage() {
		System.out.println("15kmph");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hyundai h=new Hyundai();
		h.hyundaimileage();
		h.brand();
		h.color();
		h.engine();
		h.horn();

	}

}
