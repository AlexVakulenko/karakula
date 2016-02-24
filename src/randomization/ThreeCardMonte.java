package randomization;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Random r = null;
    Scanner s = null;
    s = new Scanner(System.in);
    r = new Random();

    int target = 1 + r.nextInt(3);
    int shot;

    try {

      shot = inputData(s);
      printResult(target, shot);

    } finally {

      s.close();
    }
  }

  private static void printResult(int target, int shot) {
    if (shot == target) {
      System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
      printCards(target);
    } else {
      System.out.println("Ha! Fast Eddie wins again! The ace was card number" + target);
      printCards(target);
    }
  }

  private static int inputData(Scanner s) {
    int shot;
    System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
    System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
    System.out.println("He lays down three cards.");
    System.out.println();
    System.out.println("Which one is the ace?");
    System.out.println();
    System.out.println("  ##  ##  ##");
    System.out.println("  ##  ##  ##");
    System.out.println("  1   2   3");
    System.out.println();
    System.out.print(">>>");
    shot = s.nextInt();
    return shot;
  }

  private static void printCards(int target) {
    switch (target) {
    case 1:
      System.out.println("  AA  ##  ##");
      System.out.println("  AA  ##  ##");
      System.out.println("  1   2   3");

      break;
    case 2:
      System.out.println("  ##  AA  ##");
      System.out.println("  ##  AA  ##");
      System.out.println("  1   2   3");
      break;
    case 3:
      System.out.println("  ##  ##  AA");
      System.out.println("  ##  ##  AA");
      System.out.println("  1   2   3");
      break;
    }
  }
}
