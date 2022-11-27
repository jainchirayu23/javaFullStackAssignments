package ineuron.ai;

//WAP to remove Duplicates from a String.(Take any String ex with duplicates
//character)

/*
 * Note: We can take the user input also
 * Scanner sc = new Scanner(System.in;
 * String str = sc.nextLine();
 * */

public class Question1 {

	public static void main(String[] args) {
		String str = "Great responsiblily";
		
		str = str.replace(" ","");
		
		str = str.toLowerCase();
		
		for(int i = 0; i< str.length();i++) {
			
			for(int j = i +1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					str = str.replace(str.charAt(j),'1');
				}
			}
		}
		
		System.out.println(str);
		
		str = str.replace("1", "");
		
		System.out.println(str);
		
		//All duplicates are removed.

	}

}
