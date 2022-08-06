import java.util.Scanner;

class Guesser{
	
	Scanner sc = new Scanner(System.in);
	public int guess()
	{
		int guessnum;
		
		guessnum=sc.nextInt();
		if(!(guessnum>0 && guessnum<10))
		{
			System.out.println(" guesser please guess single digit" );
			return guess();
		}
		else
		{
		return guessnum;
		}
	}
}

class Player
{
	int pguessnum;
	Scanner sc = new Scanner(System.in);
	public int pguess()
	{
		pguessnum=sc.nextInt();
		if(!(pguessnum>0 && pguessnum<10))
		{
			System.out.println(" player please guess single digit" );
			return pguess();
		}
		else
		{
		return pguessnum;
		}
	}
}
	
class Umpire
{
	int numfromguesser;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;
	
	void guesser()
	{
	System.out.println(" Guesser PLEASE GUESS THE NUMBER");
	Guesser obj = new Guesser();
	numfromguesser=obj.guess();
	
	}
	void player()
	{
	Player obj1 = new Player();
	Player obj2 = new Player();
	Player obj3 = new Player();
	System.out.println(" Player1 PLEASE GUESS THE NUMBER");
	numfromplayer1=obj1.pguess();
	System.out.println(" Player2 PLEASE GUESS THE NUMBER");
	numfromplayer2=obj2.pguess();
	System.out.println(" Player3 PLEASE GUESS THE NUMBER");
	numfromplayer3=obj3.pguess();
	}
	void compare()
	{
		if(numfromguesser==numfromplayer1)
		{
			if(numfromguesser==numfromplayer2&&numfromguesser==numfromplayer3)
			{
				System.out.println("Game Tied,ALL PLAYERS GUESSED CORRECTLY");
			}
			else if(numfromguesser==numfromplayer2)
			{
				System.out.println("player1 and player2 won the game");
			}
			else if(numfromguesser==numfromplayer3)
			{
				System.out.println("player1 and player3 won the game");
			}
			else
			{
				System.out.println("player1 won the game");
			}
		}
		else if(numfromguesser==numfromplayer2)
				{
			if(numfromguesser==numfromplayer3)
			{
				System.out.println("player2 and player3 won the game");
			}
			else
			{
				System.out.println("player2 won the game");
				}
			
			}
		else if(numfromguesser==numfromplayer3)
		{
			System.out.println("player3 won the game");
		}
		else
		{
			System.out.println("Game lost!!,TRY AGAIN");
		}
	}
}
public class Game {

	public static void main(String[] args) {
		System.out.println("ARE U READY TO PLAY THE GAME ????");
		System.out.println();
		System.out.print("PRESS 1 TO START THE GAME"+"   ");
		System.out.println("PRESS 0 TO EXIT");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 0: System.out.println("THE END");
				System.out.println("*************************************************************");
				System.exit(0);
				break;
		case 1: Umpire obj = new Umpire();
				 obj.guesser();
		         obj.player();
		         obj.compare();	
		         System.out.println("*************************************************************");
		         break;
		default: System.out.println("Sorry!! please enter valid digit");
				 System.out.println("*************************************************************");
		         break;
		}
		

	}

}
