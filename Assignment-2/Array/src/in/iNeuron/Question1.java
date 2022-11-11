package in.iNeuron;

import java.util.HashSet;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,2,3,2,3,1,4,4,5};
		
		// We could also use ArrayList so there is no need to specify the size.
		
		int [] duplicates = new int[a.length];
		//To maintain the duplicates array
		int k = 0;
		
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = i + 1; j < a.length; j++) {
				
				if(a[i] == a[j]) {
					duplicates[k] = a[i];
					k++;
				}
			}
		}
		
		
		
		//Display all duplicate elements
		for(int n: duplicates) {
			System.out.print(n  + " ");
		}
		
	}
	
	//Time Complexity: O(n^2)
	//Space Complexity: O(n)

}
