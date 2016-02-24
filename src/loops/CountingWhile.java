package loops;

import java.util.Scanner;

public class CountingWhile {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);

    try {
      System.out.println("Type in a message, and I'll display it five times.");
      System.out.print("Message: ");
      String message = keyboard.nextLine();

      int n = 0;
      while (n < 30) {
        System.out.println((n + 10) + ". " + message);
        n = n + 10;
      }

    } finally {
      keyboard.close();
    }
  }
}