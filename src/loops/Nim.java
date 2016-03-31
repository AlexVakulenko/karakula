package loops;

import java.util.Scanner;

public class Nim {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String player1;
    String player2;
    String nextPlayer;

    int a = 3;
    int b = 4;
    int c = 5;

    int toRemove;
    int result;
    char target;
    boolean isEmpty = false;

    char pileA = 'A';
    char pileB = 'B';
    char pileC = 'C';

    Scanner keyboard = null;
    keyboard = new Scanner(System.in);

    // enter players

    System.out.print("Player 1, enter your name: ");
    player1 = keyboard.next();

    System.out.print("Player 2, enter your name: ");
    player2 = keyboard.next();

    // print controls
    System.out.println("A: " + a + "  B: " + b + "  C: " + c);

    nextPlayer = player1;
    do {

      if (nextPlayer.equals(player1)) {

        System.out.print(player1 + ", choose a pile: ");
        target = keyboard.next().charAt(0);

        if (target == pileA) {
          if (a <= 0) {
            isEmpty = true;
          } else {
            isEmpty = false;
          }

        } else if (target == pileB) {
          if (b <= 0) {
            isEmpty = true;
          } else {
            isEmpty = false;
          }
        } else if (target == pileC) {
          if (c <= 0) {
            isEmpty = true;
          } else {
            isEmpty = false;
          }
        }

        if (isEmpty == true) {

          System.out.println("Nice try, " + player1 + ". That pile is empty. Choose again: ");

        } else {

          System.out.print("How many to remove from pile " + target);
          toRemove = keyboard.nextInt();

          if (target == pileA) {
            a = a - toRemove;
          } else if (target == pileB) {
            b = b - toRemove;
          } else if (target == pileC) {
            c = c - toRemove;
          }
          System.out.println("A: " + a + "  B: " + b + "  C: " + c);

          nextPlayer = player2;
        }

      } else if (nextPlayer.equals(player2)) {

        System.out.print(player2 + ", choose a pile: ");
        target = keyboard.next().charAt(0);

        if (target == pileA) {
          if (a <= 0) {
            isEmpty = true;
          } else {
            isEmpty = false;
          }

        } else if (target == pileB) {
          if (b <= 0) {
            isEmpty = true;
          } else {
            isEmpty = false;
          }
        } else if (target == pileC) {
          if (c <= 0) {
            isEmpty = true;
          } else {
            isEmpty = false;
          }
        }

        if (isEmpty == true) {
          System.out.println("Nice try, " + player2 + ". That pile is empty. Choose again: ");

        } else {

          System.out.print("How many to remove from pile " + target);
          toRemove = keyboard.nextInt();

          if (target == pileA) {
            a = a - toRemove;
          } else if (target == pileB) {
            b = b - toRemove;
          } else if (target == pileC) {
            c = c - toRemove;
          }
          System.out.println("  A: " + a + "  B: " + b + "  C: " + c);
          nextPlayer = player1;
        }
      }

    } while (a > 0 | b > 0 | c > 0);

    System.out.println(nextPlayer + ", there are no counters left, so you WIN!");
  }

}