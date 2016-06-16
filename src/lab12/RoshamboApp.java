package lab12;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// for the inputs
		Scanner scan = new Scanner(System.in);
		// handles all the validation
		Validator validator = new Validator();

		// first get name
		String name = "";
		System.out.println("Enter name:");
		name = scan.nextLine();

		// Make a loop to control and eventl. repeat name
		boolean contName = true;
		while (contName) {
			if (validator.isValidName(name)) {
				// what happens if wrong
				contName = false;
			} else {
				System.out.println("Please enter a valid name!: ");
			}
		}
		System.out.println("Welcome, " + name + "!");

		// select the opponent

		boolean contOpponent = true;
		// control event. repeat
		while (contOpponent) {
			// while true choose
			System.out.println("Please choose player 1 or player2: ");
			String choicePlayer = scan.nextLine();

			if (validator.isValidOpponent(choicePlayer)){
				
			// create the Opponent Player depending on the users choice

		}
		if (choicePlayer.equalsIgnoreCase("1")) {
			// one possibility
			// only 2 player opponent
			// opponentPlayer = new PlayerRandom();

		} else {
			// the other possibility
			// opponentPlayer = newPlayerRock(;)
		}
		contOpponent = false;
		} else {
			 System.out.println("Please enter 1 or 2!");
		}
	}

	// now user choose his roshambo

	// need a while loop
	boolean contRoshambo = true;

}
