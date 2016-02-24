package loops;

import java.util.Scanner;

public class RightTriangleChecker {

  static int a;
  static int b;
  static int c;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s = null;

    s = new Scanner(System.in);

    System.out.println("Enter three integers:");

    try {
      inputA(s);

      inputB(s);

      inputC(s);

    } finally {
      s.close();
    }

    printResult(a, b, c);

  }

  private static void inputC(Scanner s) {
    do {
      System.out.print("Side 3: ");
      c = s.nextInt();
      if (c < b) {
        System.out.println(c + " is smaller than " + b + ".  Try again.");
      }
    } while (c < b);
  }

  private static void inputB(Scanner s) {
    do {
      System.out.print("Side 2: ");
      b = s.nextInt();
      if (b < a) {
        System.out.println(b + " is smaller than " + a + ".  Try again.");
      }

    } while (b < a);
  }

  private static void inputA(Scanner s) {
    do {
      System.out.print("Side 1: ");
      a = s.nextInt();

      if (a < 0) {
        System.out.println("\nenter some positiv integer");
      }
    } while (a < 0);
  }

  private static void printResult(int a, int b, int c) {
    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
      System.out.println("Your three sides are " + a + " " + b + " " + c);
      System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");

    } else if (Math.pow(a, 2) + Math.pow(b, 2) != Math.pow(c, 2)) {
      System.out.println("Your three sides are " + a + " " + b + " " + c);
      System.out.println("NO!  These sides do not make a right triangle!");
    }
  }
}
