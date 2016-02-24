package loops;

import java.util.Scanner;

public class PinLockout {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner keyboard = new Scanner(System.in);

    try {
      int pin = 12345;
      int tries = 0;
      int triesMax = 4;

      System.out.println("WELCOME TO THE BANK OF MITCHELL.");
      System.out.print("ENTER YOUR PIN: ");
      int entry = keyboard.nextInt();
      tries++;

      while (entry != pin && tries < triesMax) {
        System.out.println("\nINCORRECT PIN. TRY AGAIN.");
        System.out.print("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();
        tries++;
      }

      if (entry == pin)
        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
      else if (tries >= triesMax)
        System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
    } finally {
      keyboard.close();
    }
  }
}