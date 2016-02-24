package ifstatements;

import java.util.Random;
import java.util.Scanner;

public class WorstGuessing {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Random r = null;
    Scanner keyboard = null;
    r = new Random();
    keyboard = new Scanner(System.in);

    int number;
    int secretNumber = 1 + r.nextInt(10);

    try {

      System.out.println("TEH NUBMER GESSING GAME EVAR!!!!!!!1!");
      System.out.println();
      do {
        System.out.print("I\'M THKING OF A NBR FROM 1-10.  TRY to GESS! >>>");
        number = keyboard.nextInt();
        // System.out.println(secretNumber);

        if (number == secretNumber) {
          System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + secretNumber + "!");
        } else if (!(number == secretNumber)) {
          System.out.println("NOOOO!!! You do not guess it!! Try again!!!");
          System.out.println();
        }
      } while (!(number == secretNumber));

    } finally {
      keyboard.close();
    }
  }
}
