package day7;

public class FindNumberOfRepetations {

	public static void main(String[] args) {


		int repetation = 0;
		
		int a[] = {1,2,3,4,5,5,5,6,6,7,7,7,7,7,8,9,10,10,10,10};
		
		int search_key = 10;
		
		for(int i=0; i<a.length; i++) {
			
			if(search_key == a[i]) {
				
				repetation+=1;
			}
		}
		
		System.out.println("Key value of "+search_key+" repetation = "+repetation);
	}

}
