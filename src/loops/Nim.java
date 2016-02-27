package loops;

import java.util.Scanner;

public class Nim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int howManyPlayers;

		String username;
		Scanner s = null;

		s = new Scanner(System.in);

		// enter players quantity
		System.out.print("How many players do you want? >>>");
		howManyPlayers = s.nextInt();

		// create array for player names
		String players[] = new String[howManyPlayers];

		// fill up array for players names
		for (int i = 0; i < players.length; i++) {
			System.out.print("Enter user " + (i + 1) + " name");
			username = s.next();
			players[i] = username;
		}
		// print plalers array
		for (int i = 0; i < players.length; i++) {
			String player = players[i];
			System.out.println(player);

		}

		// create player instance
		for (int i = 0; i < players.length; i++) {
			// Object player = players[i];
			// PlayerNim players[i] = new PlayerNim();

		}
	}
}
