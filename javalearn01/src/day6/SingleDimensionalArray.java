package day6;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		System.out.println(a[4]);
		
		int x[] = {};
		
		System.out.println(x.length);
		
		System.out.println(a.length);
		
		
		int tot = 0;
		
		for(int i = 0; i<=4; i++) {
			
			System.out.println(a[i]);
			
			tot += a[i];
		}
		
		System.out.println(tot);
		
		
		System.out.println("-------------------");
		
		
		
		for(int z:a) {
			
			System.out.println(z);
		}
		
		
		
		ArrayList<Integer> myList = new ArrayList<>();
		
		myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);
        
        
        Integer myarray[] = myList.toArray(new Integer[0]);
        
        System.out.println(Arrays.toString(myarray));
	}
	
	
}
