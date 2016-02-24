package loops;

import java.util.Scanner;

public class EnterPIN {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);
    int pin = 12345;

    try {
      System.out.println("WELCOME TO THE BANK OF MITCHELL.");
      System.out.print("ENTER YOUR PIN: ");
      int entry = keyboard.nextInt();

      while (entry != pin) {
        System.out.println("\nINCORRECT PIN. TRY AGAIN.");
        System.out.print("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();
      }
    } finally {
      keyboard.close();
    }
    System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
  }

}
