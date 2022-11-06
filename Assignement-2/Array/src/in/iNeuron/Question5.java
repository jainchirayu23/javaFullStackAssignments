package in.iNeuron;

public class Question5 {
	
	static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void selectionsort(int [] arr) {
		for(int i =0; i< arr.length-1;i++) {
			int min_idx = i;
			
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min_idx])
					min_idx = j;
				}
			
			swap(arr,i,min_idx);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []ar = {11,43,32,7,89,10,1,90};
		
		selectionsort(ar);
		
		for(int elem: ar) {
			System.out.print(elem+ " ");
		}

	}

}
