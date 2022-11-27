package ineuron.ai;

//WAP to check if “2552” is palindrome or not.

/*
 * Note: We can take the user input also
 * Scanner sc = new Scanner(System.in;
 * String str = sc.nextLine();
 * */

public class Question3 {

	public static void main(String[] args) {
		
		String str = "2552";
		
		String check = "";
		
		for (int i = str.length()-1 ; i >=0; --i) {
			check += str.charAt(i);
		}
		
		if(str.equals(check)) {
			System.out.println("It's Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	
	//Output:It's Palindrome

}
