package loops;

import java.util.Scanner;

public class AddingValuesInALoop {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s = null;
    s = new Scanner(System.in);

    int currentN;
    int total = 0;

    try {
      System.out.println("I will add up the numbers you give me.");
      System.out.print("Number: ");
      currentN = s.nextInt();

      while (currentN != 0) {
        total = currentN + total;
        System.out.println("The total so far is " + total);
        System.out.print("Number: ");
        currentN = s.nextInt();
      }
      if (currentN == 0) {
        System.out.println("The total is " + total);
      }

    } finally {
      s.close();
    }
  }
}