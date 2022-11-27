package ineuron.ai;

//WAP to count the number of consonants, vowels, special characters in a String

public class Question4 {
	
//	public static String getToLowerCase(String str) {
//		String res = "";
//		
//		for(int i = 0; i < str.length(); i ++) {
//			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
//				res += (char)str.charAt(i)+32;
//		}
//		
//		return res;
//		
//	}
	
	public static void checkVowelsConsonantsSpecailChar(String str) {
		
		int vowels = 0, consonants = 0, special = 0;
		
		for(int i =0; i < str.length(); i++) {
			if( (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') ||
					(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')) {
				vowels++;
			}else if(str.charAt(i)=='!' || str.charAt(i)=='@' || str.charAt(i)=='#' || str.charAt(i)=='$') {
				special++;
			}else 
				consonants++;
		}
		
		System.out.println("Total Vowels : " + vowels);
		System.out.println("Total Consonants : " + consonants);
		System.out.println("Total Special : " + special);
	}

	public static void main(String[] args) {
		String str = "I am Chirayu Jain currently enrolled $ Java Course from # iNeuron";
		
		str = str.replace(" ", "");
	
		checkVowelsConsonantsSpecailChar(str);
			
	}
	
	/*
	 * Output:
	 * Total Vowels : 22
	 *  Total Consonants : 30
	 *  Total Special : 2
	 *  */

}
