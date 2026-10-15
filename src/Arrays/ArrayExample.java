package Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		System.out.println(a);
		System.out.println(b);
		
		//instead we use array
		int []array= {1,2,3,4};
		for (int ref:array) {
			System.out.println(ref);
		}
		
		//Creating an Array
		int []arr=new int[10];
		System.out.println("Length of array: "+arr.length);
		//initializing elements
		arr[0]=1;
		arr[4]=3;
		System.out.println("Iterating through array using for each loop");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("Iterating through array using for loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
