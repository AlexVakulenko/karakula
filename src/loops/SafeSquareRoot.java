package loops;

import java.util.Scanner;

public class SafeSquareRoot {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    double numIn;
    Scanner s = null;
    s = new Scanner(System.in);

    try {
      System.out.println("SQUARE ROOT!");
      System.out.print("Enter a number: ");
      numIn = s.nextDouble();

      while (numIn < 0) {
        System.out.println("You can't take the square root of a negative number, silly.");
        System.out.print("Enter a number: ");
        numIn = s.nextDouble();
      }
      double result = Math.sqrt(numIn);
      System.out.println("The square root of " + numIn + " is " + result);

    } finally {
      s.close();
    }
  }
}