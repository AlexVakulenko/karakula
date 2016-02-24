package ifstatements;

import java.util.Scanner;

public class AlphabeticalOrder {

  public static void main(String[] args) {

    // int i;
    String name = null;
    // TODO Auto-generated method stub
    Scanner keyboard = null;
    keyboard = new Scanner(System.in);

    try {
      System.out.print("What's your last name? ");
      name = keyboard.next();

      if (name.compareTo("Carswell") <= 0) {
        System.out.println("you don't have to wait long");

      } else if (name.compareTo("Jones") <= 0) {
        System.out.println("that's not bad");

      } else if (name.compareTo("Smith") <= 0) {
        System.out.println("that's not bad");

      } else if (name.compareTo("Young") <= 0) {
        System.out.println("it's gonna be a while");

      } else if (name.compareTo("Young") > 0) {
        System.out.println("not going anywhere for a while?");
      }

      // System.out.println(i);
    } finally {
      keyboard.close();
    }
  }
}