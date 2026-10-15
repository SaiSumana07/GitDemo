package constructor;

public class This {
	
	int a;
	
	This(int a){
		//this is used to call global var
		this.a=a;
	}
	public static void main(String[] args) {
		This t= new This(20);
		//globbal var printing
		System.out.println(t.a);
	}
}
