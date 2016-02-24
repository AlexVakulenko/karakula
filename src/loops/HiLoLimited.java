package loops;

import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int limit = 7;
    int target = 0;
    // int answer;
    int count = 0;
    // Random r = null;
    Scanner s = null;
    String sorryL = "Sorry, you are too low.";
    String sorryH = "Sorry, you are too high.";

    s = new Scanner(System.in);

    target = randomGenerator();

    try {
      guesser(limit, target, count, s, sorryL, sorryH);

    } finally {
      s.close();
      System.exit(0);
    }
  }

  private static void guesser(int limit, int target, int count, Scanner s, String sorryL, String sorryH) {
    int answer;
    System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
    System.out.print("First guess: ");
    answer = s.nextInt();
    count++;

    while (answer != target && count < limit) {
      if (answer < target) {
        System.out.println(sorryL);
        System.out.print("Guess # " + (count + 1) + " ");
        answer = s.nextInt();
        count++;

      } else if (answer > target) {
        System.out.println(sorryH);
        System.out.print("Guess # " + (count + 1) + " ");
        answer = s.nextInt();
        count++;
      }
    }
    if (answer == target) {
      System.out.println("You guessed it!  What are the odds?!? It was " + target);

    } else if (count == limit) {
      System.out.println("Sorry, you didn't guess it in 7 tries.  You lose. It was " + target);
    }
  }

  private static int randomGenerator() {
    int target;
    Random r;
    r = new Random();
    target = 1 + r.nextInt(100);
    return target;
  }
}