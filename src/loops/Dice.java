package loops;

import java.util.Random;

public class Dice {
  static int roll1;
  static int roll2;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    @SuppressWarnings("unused")
    Random r = null;
    do {

      int total = randomGenerator();

      start();

      print(total);

    } while (roll1 != roll2);

  }

  private static void print(int total) {
    System.out.println("Roll #1: " + roll1);
    System.out.println("Roll #2: " + roll2);
    System.out.println("The total is " + total + "!");
  }

  private static int randomGenerator() {
    Random r;
    r = new Random();
    roll1 = 1 + r.nextInt(6);
    roll2 = 1 + r.nextInt(6);
    int total = roll1 + roll2;
    return total;
  }

  private static void start() {
    System.out.println("HERE COMES THE DICE!");
  }

}
