package day7;

import java.util.Scanner;

public class UserInputWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter Integer Value :- ");
		Scanner sc = new Scanner(System.in);
		
		// sc.nextInt();  take user input value as integer value
		
		int num = sc.nextInt();
		
		System.out.println(num);
		
		
		System.out.print("Enter Decimal Number :-");
		
		Scanner dc = new Scanner(System.in);
		
		double num1 = dc.nextDouble();
		
		System.out.println(num1);
		
		
		System.out.println("Enter your city:- ");
		Scanner ou = new Scanner(System.in);
		String city = ou.next();
		System.out.println(city);
		

	}

}
