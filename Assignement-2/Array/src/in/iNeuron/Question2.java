package in.iNeuron;

public class Question2 {
	
//	To Implement Quick Sort
	static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static int partition(int [] arr,int low ,int high) {
		
		int pivot = arr[high];
		
		int i = (low - 1);
		
		for (int j= low; j <= high - 1; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr,i+1,high);
		return (i+1);
			
	}
	
	static void quicksort(int []arr, int low, int high) {
		if(low < high) {
			int getPivot = partition(arr,low,high);
			
			quicksort(arr,low,getPivot-1);
			quicksort(arr,getPivot+1,high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []ar = {20,45,3,50,28,70,87,56,52,1};
		
		quicksort(ar,0,ar.length-1);
		
		for(int elem: ar) {
			System.out.print(elem + " ");
		}
		
	}

}
