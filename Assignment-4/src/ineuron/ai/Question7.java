package ineuron.ai;

//WAP to find if String contains all unique characters.

public class Question7 {

	public static void main(String[] args) {
		String str = "abcdefgzyxpqrs";
		
		boolean flag = true;
		
        str = str.replace(" ", "");
		
		str = str.toUpperCase();
		
		int [] arr = new int[26];
		
		for(int i = 0; i < str.length();i++) {
			int index = (int)str.charAt(i)-65;
			arr[index]++;
		}
		
		for(int elem:arr) {
			if(elem >=2) {
				System.out.println("Not Unique String");
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("All unique characters");
		}
		
		
	}
	
//	Output: All unique characters

}
