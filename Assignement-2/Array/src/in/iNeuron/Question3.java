package in.iNeuron;

public class Question3 {
	
	static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void bubblesort(int []arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 -i; j++) {
				if(arr[j+1]<arr[j]) {
					swap(arr,j,j+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar = {11,43,32,7,89,10,1,90};
		
		bubblesort(ar);
		
		for(int elem: ar) {
			System.out.print(elem + " ");
		}

	}

}
