package day7;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		
		int search_element = 50;
		
		boolean status = false; // false:not found  true:found value
		
		for(int i=0; i<=a.length-1; i++) {
			
			if(a[i] == search_element) {
				
				System.out.println(a[i]+" Element is in this array");
				status = true;
				break;
			}
		}
		
		if(status == false) {
		
		System.out.println("Element not found");
		}

	}

}
