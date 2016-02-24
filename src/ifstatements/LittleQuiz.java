package ifstatements;

import java.util.Scanner;

public class LittleQuiz {

  // String answer;
  static int count;
  static int choice;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);

    // if (answer == "Y") {
    // System.out.println("Okay, here it comes!");
    // } else if (answer == "N") {
    // keyboard.close();
    // System.exit(0);
    // } else {
    //
    // while (!(answer == "Y" & answer == "N")) {
    // System.out.print("Are you ready for a quiz? Print Y or N.");
    // answer = keyboard.next();

    starter(keyboard);

    questor(keyboard);
    counter();

  }

  private static void counter() {
    System.out.println();
    System.out.println("Overall, you got " + count + " out of 3 correct.");
    System.out.println("Thanks for playing!");
  }

  private static void starter(Scanner keyboard) {
    System.out.print("Are you ready for a quiz? Print Y or N.");
    keyboard.next();
    System.out.println();
  }

  private static void questor(Scanner keyboard) {
    question1(keyboard);

    question2(keyboard);

    question3(keyboard);
  }

  private static void question3(Scanner keyboard) {
    System.out.println("Q3) What is the result of 9+6/3?");
    System.out.println("  1) 5");
    System.out.println("  2) 11");
    System.out.println("  3) 15/3");
    System.out.println();
    System.out.print(">>>");
    choice = keyboard.nextInt();
    keyboard.close();

    if (choice == 2) {
      System.out.println("That's correct!");
      count++;
    } else {
      System.out.println("Sorry, should you study some mathematic :) ");
    }
  }

  private static void question2(Scanner keyboard) {
    System.out.println("Q2) Can you store the value 'cat' in a variable of type int?");
    System.out.println("  1) yes");
    System.out.println("  2) no");
    System.out.println();
    System.out.print(">>>");
    choice = keyboard.nextInt();
    if (choice == 2) {
      System.out.println("That's right!");
      count++;
      System.out.println();
    } else {
      System.out.println("Sorry, 'cat' is a string. ints can only store numbers.");
      System.out.println();
    }
  }

  private static void question1(Scanner keyboard) {
    System.out.println("Q1) What is the capital of Alaska?");
    System.out.println("  1) Melbourne");
    System.out.println("  2) Anchorage");
    System.out.println("  3) Juneau");
    System.out.println();
    System.out.print(">>>");
    choice = keyboard.nextInt();
    System.out.println();
    if (choice == 3) {
      System.out.println("That's right!");
      count++;
      System.out.println();
    } else {
      System.out.println("Sorry, improve your knoledge");
      System.out.println();
    }
  }

}
