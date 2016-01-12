import java.util.Scanner;
public class GameRPS {

	public static void main(String[] args) {
		
		//Generate a random Rock, Paper or Scissors
		int game =(int)(Math.random() * 2);
		
		//Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.println("Let's play Rock - Paper - Scissors!!!");
		System.out.println("Enter a number... Rock (0), Paper (1) or Scissors(2): ");
		int guess = input.nextInt();
		
		//Check the guess
		if (guess == game){
			System.out.println("The computer picked: " + game + " .");
			System.out.println("You picked: " + guess + " too.");
			System.out.println("It's a tie!");
		}
		else if (game == 0 && guess == 1 || game == 1 && guess == 2 || game == 2 && guess == 0){
			System.out.println("The computer picked: " + game + " .");
			System.out.println("You picked: " + guess + " .");
			System.out.println("You won!");
		}	
		else if (guess == 0 && game == 1 || guess == 1 && game == 2 || guess == 2 && game == 0){	
			System.out.println("The computer picked: " + game + " .");
			System.out.println("You picked: " + guess + " .");
			System.out.println("You lose!");
		}
		else {
			System.out.println("Game Over.");
		}
		}
			
		
	}
