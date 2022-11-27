package ineuron.ai;

//WAP to implement Pangram Checking with least inbuilt methods being used.

public class Question6 {

	public static void main(String[] args) {
		String str ="The quick brown fox jumps over the lazy dog";
		
		boolean flag = true;
		str = str.replace(" ", "");
		
		str = str.toUpperCase();
		
		
		int [] arr = new int[26];
		
		for(int i = 0; i < str.length();i++) {
			int index = (int)str.charAt(i)-65;
			arr[index]++;
		}
		
		for(int elem:arr) {
			if(elem == 0) {
				System.out.println("Not Pangram");
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("It's Pangram");
		}
		

	}
	
	//Output: It's Pangram

}
