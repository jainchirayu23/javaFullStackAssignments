package ineuron.ai;

//WAP to find the maximum occurring character in a String.

public class Question8 {

	public static void main(String[] args) {
		String str = "Hello I am learing Java from iNeuron";
	
		int maxCount = 0;
		
		str = str.replace(" ", "");
		
		str = str.toLowerCase();
		
		int []array = new int[26];
		
		for(int i = 0; i < str.length();i++) {
			int indx = str.charAt(i)-97;
			array[indx]++;
		}
		
		int maxIndex = 0;
		for(int i = 0; i < array.length;i++) {
			if(array[i] > maxCount) {
				maxCount = array[i];
				maxIndex = i;
			}
		}
		
		char  ch = (char)(maxIndex+97);
		
		System.out.println("The maximum occurring character is: " + ch);
		System.out.println("The count of the character is: "+ maxCount);
		
	}
	
	/*
	 * Output:
	 * The maximum occurring character is: a
	 * The count of the character is: 4
	 * */

}
