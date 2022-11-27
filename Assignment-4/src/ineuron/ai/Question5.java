package ineuron.ai;

import java.util.Arrays;

//WAP to implement Anagram Checking least inbuilt methods being used.

public class Question5 {

	public static void main(String[] args) {
		String s1 = "a gentleman";
		String s2 = "elegant man";
		
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		
		char []str1 = s1.toCharArray();
		char []str2 = s2.toCharArray();
		
		Arrays.parallelSort(str1);
		Arrays.parallelSort(str2);
		
		if(Arrays.equals(str1, str2)) 
			System.out.println("It's Anagram");
		else
			System.out.println("Not Anagram");
			
		
	}

}
