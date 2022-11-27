package ineuron.ai;

//WAP to print Duplicates characters from the String.

/*
 * Note: We can take the user input also
 * Scanner sc = new Scanner(System.in;
 * String str = sc.nextLine();
 * */

public class Question2 {

	public static void main(String[] args) {
		String str = "Great responsiblity";
		
		str = str.replace(" ","");
		
		str = str.toLowerCase();
		
		String duplicates = "";
		
		for(int i = 0; i< str.length();i++) {
			
			for(int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					duplicates += str.charAt(i);
				}
			}
		}
		
		System.out.println(duplicates); //retsi
		
	}

}
