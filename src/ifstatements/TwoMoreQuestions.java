package ifstatements;

import java.util.Scanner;

public class TwoMoreQuestions {

  static String answer1;
  static String answer2;
  static String result = null;

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    inputData();

    calculate();

    printResult();
  }

  private static void printResult() {
    System.out.println("You be thinking of " + result + "?");
  }

  private static void calculate() {
    if (answer1.equals("inside") && answer2.equals("yes")) {
      result = "houseplant";
    }
    if (answer1.equals("outside") && answer2.equals("yes")) {
      result = "bison";
    }
    if (answer1.equals("both") && answer2.equals("yes")) {
      result = "dog";
    }
    if (answer1.equals("inside") && answer2.equals("no")) {
      result = "shower curtain";
    }
    if (answer1.equals("outside") && answer2.equals("no")) {
      result = "billboard";
    }
    if (answer1.equals("both") && answer2.equals("no")) {
      result = "cell phone";
    }
  }

  private static void inputData() {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Does it belong \"inside\" or \"outside\" or \"both\"?");
      answer1 = scan.next();
      System.out.print("Is it alive? \"yes\" or \"no\"");
      answer2 = scan.next();
    }
  }

}