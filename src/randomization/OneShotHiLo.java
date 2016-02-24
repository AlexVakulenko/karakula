package randomization;

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Random r = null;
    Scanner s = null;
    s = new Scanner(System.in);
    r = new Random();

    int target = 1 + r.nextInt(100);
    int shot;

    try {
      shot = inputData(s);

      printResult(target, shot);

    } finally {
      s.close();
    }
  }

  private static int inputData(Scanner s) {
    int shot;
    System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
    System.out.print(">>>");
    shot = s.nextInt();
    return shot;
  }

  private static void printResult(int target, int shot) {
    if (shot < target) {
      System.out.println("Sorry, you are too low.  I was thinking of " + target);
    } else if (shot > target) {
      System.out.println("Sorry, you are too high.  I was thinking of " + target);
    } else if (shot == target) {
      System.out.println("You guessed it!  What are the odds?!? I was thinking of " + target);
    }
  }
}