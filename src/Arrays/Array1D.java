package Arrays;

public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//different ways of creation of array
		int a[];
		int []b;
		int [] c;
		//instantiation
		a=new int[5];
		
		//initializing array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//a[5]=60;//Index out of bounds
		for (int i : a) {
			System.out.println(i);
		}
		
		
		
		
		//instead we can do in a single line - create and instantiatie
		int []d=new int[5];
		
		//or we can create instantiate and intialize array
		int array[]= {1,2,3,4,5};
		System.out.println(array[1]);
	}

}
