package in.iNeuron;

public class Question6 {
	
	

	public static void main(String[] args) {
		int []arr1 = { 10, 11, 13, 21, 23, 7 };
		int []arr2 = { 11, 23,7 };
		
		int countCheck = arr2.length;
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				if(arr2[i] == arr1[j]) {
					countCheck--;
					break;
				}
			}
		}
		
		if(countCheck == 0) {
			System.out.println("Yes,it's a subset");
		}
		else {
			System.out.println("No,it's not a  subset");
		}
		

	}

}
