package in.ineuron;

import java.util.*;


//The Guesser code
class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number - between 1 to 100 ");
		//take the input
		guessNum=scan.nextInt();

		//range check
		if(guessNum>=1 && guessNum<=100)
			return guessNum;
		else{
			System.out.println("Sir/Madam you are not within range");
			System.exit(0);
		}
		return -1;
	}	
}

//The Player Code
class Player
{
	//static concept used
	static int playerCount = 0;
	int guessNum;

	Player(){
		playerCount++;
	}
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player " + playerCount +" kindly guess the number - between 1 to 100");
		//take the input
		guessNum=scan.nextInt();
		//range check
		if(guessNum>=1 && guessNum<=100)
			return guessNum;
		else{
			System.out.println("Sir/Madam you are not within range");
			System.exit(0);
		}
		return -1;
	}
}

//The Uprime Code
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		numFromPlayer1=p1.guessNum();
		Player p2=new Player();
		numFromPlayer2=p2.guessNum();
		Player p3=new Player();
		numFromPlayer3=p3.guessNum();
	}
	//compare the players and announce the result
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}

	void rulesOfTheGame(){
		System.out.println("Let's Play Guesser Game");
		System.out.println();
		System.out.println("Rules: ");
		System.out.println("1. Guesser gues the number within the range specified ");
		System.out.println("2.All players must guess a number (hint will be provided) ");
		System.out.println("3.Try Try never cry");
		System.out.println();
	}
	
}

//Login Class 
class Login {

	boolean pass = false;

	//check the credentials
	void credentialsCheck(){

		boolean flagName = false;
		boolean flagPassword = false;

		Scanner sc = new Scanner(System.in);

		//Sign uCp detials
		System.out.println("Hello, Sir/Madam-------------------------------------");
		System.out.println();
		System.out.println("Kindly, enter your name.");

		StringBuffer name = new StringBuffer(sc.nextLine());
		
		System.out.println();
		System.out.println("Kindly,enter your password.");
		String password = sc.nextLine();
		
		//Sign in details
		System.out.println();
		System.out.println("Please Login------------------------------------------");
		System.out.println();
		System.out.println("Enter Your Name");
		StringBuffer checkName = new StringBuffer(sc.nextLine());

		System.out.println();
		System.out.println("Enter Your Password");
		String checkPassword = sc.nextLine();

		//checking 
		if(name.toString().equals(checkName.toString())){
			flagName = true;
			if(password.equals(checkPassword)){
				flagPassword = true;
				pass = true;
			}
			
		}
		
		//giving result
		if( flagName && flagPassword ) {
			System.out.println();
			System.out.println("Welcome " + name);
			System.out.println();
		}
		else {
			System.out.println("Wrong Credentials");
		}

	}
}

public class GuesserGame {

	public static void main(String[] args) {

		Login cr = new Login();
		cr.credentialsCheck();

		if(cr.pass == true){
		Umpire u=new Umpire();
		u.rulesOfTheGame();

		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		}

	}

}


/*
 * Output
Hello, Sir/Madam-------------------------------------

Kindly, enter your name.
Chirayu

Kindly,enter your password.
cj23

Please Login------------------------------------------

Enter Your Name
Chirayu

Enter Your Password
cj23

Welcome Chirayu

Let's Play Guesser Game

Rules: 
1. Guesser gues the number within the range specified 
2.All players must guess a number (hint will be provided) 
3.Try Try never cry

Guesser kindly guess the number - between 1 to 100 
23
Player 1 kindly guess the number - between 1 to 100
22
Player 2 kindly guess the number - between 1 to 100
1
Player 3 kindly guess the number - between 1 to 100
22
Game lost Try Again!
*/
