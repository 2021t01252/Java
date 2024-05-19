package day5;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=10) {
			
			System.out.println("Hello "+i);
			i++;
		}
		
		
		System.out.println("---------------------------------");
		
		
		int x = 1;
		
		while(x<=10) {
			
			if(x%2 == 0) {
				
				System.out.println(x+" Even");
			}
			else {
				
				System.out.println(x+" Odd");
			}
			
			x++;
		}
		
		
		

	}
	

}
