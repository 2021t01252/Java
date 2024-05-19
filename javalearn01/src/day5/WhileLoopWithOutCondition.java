package day5;

public class WhileLoopWithOutCondition {

	public static void main(String[] args) {


		int i = 1;
		
		while(true) {
			
			System.out.println("Hello "+i);
			i++;
			
			if(i==11) {
				
				break;
			}
		}

	}

}
