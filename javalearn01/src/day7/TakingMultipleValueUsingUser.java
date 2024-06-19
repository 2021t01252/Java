package day7;

import java.util.Scanner;

public class TakingMultipleValueUsingUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:- ");
		int num1 = sc.nextInt();
		
		System.out.print("Ënter second number:- ");
		int num2 = sc.nextInt();
		
		System.out.println("Addition of num1 and num2 = "+(num1+num2));
		
		
		System.out.println("Enter name:- ");
		String name = sc.next();
		System.out.println("My name is "+ name);
		
		
		System.out.println("Enter unknown value");
		Object value = sc.next();  //whether we don't know the data type of value we can use it using string and get the value
		System.out.println(value);
	}

}
