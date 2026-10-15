package Arrays;

import java.util.Iterator;

public class Practice {
	
	public static void main(String[] args) {
		int [] a= {1,2,3,4};
		//System.out.println(a.length);
		int [] arr=new int[5];
		arr[1]=3;
		for (int i : arr) {
			System.out.println(i);
		}
		
		//declaring arr
		int aan[];
		int []b;
		int [] c;
		
		//instantiation
		c=new int[5];
		
		//initialisation
		c[1]=3;
		for (int i : c) {
			System.out.println(i);
		}
		
		int y[][]=new int[3][3];
		int z[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < z.length; i++) {
			for(int j=0;j<z.length;j++) {
				System.out.println(z[i][j]);
			}
			
		}
	}

}
