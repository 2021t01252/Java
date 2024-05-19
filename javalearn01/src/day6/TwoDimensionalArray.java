package day6;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {


		//approach 1
		
		int a[][] = new int[3][2];
		
		// int [][]a = new int[3][2];
		// int []a[] = new int[3][2];
		
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;
		
		System.out.println(Arrays.deepToString(a));
		
		
		int b[][] = {{10,20},
				     {30,40},
				     {50,60}
				     };
		
		System.out.println(Arrays.deepToString(b));
		
		
		System.out.println("Length of rows "+a.length);
		System.out.println("Length of columns "+a[0].length);
		
		
		System.out.println(a[2][1]);
		
		System.out.println("-------------------");
		
		
		for(int i = 0; i<=2; i++){
			
			for(int j = 0; j<=1; j++) {
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
