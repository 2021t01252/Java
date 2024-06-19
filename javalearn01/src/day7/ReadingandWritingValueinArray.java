package day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingandWritingValueinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println("Ënter number "+(i+1)+":- ");
			int number = sc.nextInt();
			a[i] = number;
		}
		
		System.out.println(Arrays.toString(a));

	}

}
