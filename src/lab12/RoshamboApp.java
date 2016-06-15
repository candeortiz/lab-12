package lab12;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		System.out.println("Enter name:");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Welcome, " + name + "!");

		System.out.println("Please choose player 1 or player2");
		String playerChoice = scan.nextLine();

		System.out.println("Choose rock, paper or scissors: ");
		String roshamboChoice = scan.nextLine();

	}

}
