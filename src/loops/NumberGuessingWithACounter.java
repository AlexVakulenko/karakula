package loops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithACounter {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s = null;
    Random r = null;
    s = new Scanner(System.in);
    r = new Random();

    int count = 0;
    int target = 1 + r.nextInt(10);
    int answer;

    System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
    try {
      System.out.print("Your guess: ");
      answer = s.nextInt();
      count++;

      do {
        System.out.println("That is incorrect.  Guess again.");
        System.out.print("Your guess: ");
        answer = s.nextInt();
        count++;
      } while (answer != target);

      if (answer == target) {
        System.out.println("That's right!  You're a good guesser. I was think about " + target);
        System.out.println("It only took you " + count + " tries from 10");
      }
    } finally {
      s.close();
    }
  }
}
