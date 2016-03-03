package loops;

import java.util.Scanner;

public class Nim {

  static int A;
  static int B;
  static int C;

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String player1;
    String player2;

    int firstPlayerA = 3;
    int firstPlayerB = 4;
    int firstPlayerC = 5;

    int secondPlayerA = 3;
    int secondPlayerB = 4;
    int secondPlayerC = 5;
    int toRemove;

    char target;
    char pileA = 'A';
    char pileB = 'B';
    char pileC = 'C';

    Scanner keyboard = null;
    keyboard = new Scanner(System.in);

    // enter players quantity
    System.out.print("Player 1, enter your name: ");
    player1 = keyboard.next();

    System.out.print("Player 2, enter your name: ");
    player2 = keyboard.next();

    System.out.println("A: " + firstPlayerA + "B: " + firstPlayerB + "C: " + firstPlayerC);

    System.out.print(player1 + ", choose a pile: ");
    target = keyboard.next().charAt(0);

    if (target != 'A' | target != 'B' | target != 'C') {
      do {
        System.out.print(player1 + ", choose a pile. You con choose A or B or C ");
        target = keyboard.next().charAt(0);
      } while (target == 'A' | target == 'B' | target == 'C');
    }

    System.out.print("How many to remove from pile " + target);
    toRemove = keyboard.nextInt();

  }
}