package day3;

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic operators + - * / %
		
		int a = 10, b = 20;
		
		System.out.println("Sum of a & b "+(a+b));
		System.out.println("Diff of a & b "+(a-b));
		System.out.println("Multi of a & b "+(a*b));
		System.out.println("Division of a & b "+(a/b));
		System.out.println("Modulo of a & b "+(a%b));
		
		
		System.out.println("--------------------------");
		// relational/comparison operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		
		System.out.println("--------------------------");
		// Logical operators
		
		System.out.println((a>b) && (a<b));
		System.out.println((a<b) || (a>b));
		System.out.println(!(a<=b));

		
		System.out.println("--------------------------");
		// Increment and Decrement operators
		
		int p = 20;
		
		System.out.println(p);
		System.out.println(p++);
		System.out.println(p);
		
		System.out.println("-----");
		
		System.out.println(p);
		System.out.println(p--);
		System.out.println(p);
		
		System.out.println("-----");
		
		System.out.println(p);
		System.out.println(++p);
		System.out.println(p);
		
		System.out.println("-----");
		
		System.out.println(p);
		System.out.println(--p);
		System.out.println(p);
		
		
		System.out.println("--------------------");
		// Assignment operators
		
		int x = 90;
		
		System.out.println(x+=5);
		System.out.println(x-=5);
		System.out.println(x*=2);
		System.out.println(x/=4);
		System.out.println(x%=7);
		
		System.out.println("--------------------");
		// Conditional or ternary operator
		
		int j = 200, k = 100;
		
		int result = (j>k)? j:k;
		
		System.out.println(result);
		
        int result1 = (j<k)? j:k;
		
		System.out.println(result1);
		
		
	}

}
