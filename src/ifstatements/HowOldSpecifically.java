package ifstatements;

import java.util.Scanner;

public class HowOldSpecifically {
  static int age;
  static String name;

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    inputData();

    printDecision(age, name);

  }

  private static void inputData() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
    name = keyboard.next();

    System.out.print("Ok, " + name + ", how old are you? ");
    age = keyboard.nextInt();
    keyboard.close();
  }

  private static void printDecision(int age, String name) {
    if (age < 16) {
      System.out.println("You can't drive, " + name);
    } else if (age >= 16 && age <= 17) {
      System.out.println("You can drive but not vote, " + name);
    } else if (age >= 18 && age <= 24) {
      System.out.println("You can vote but not rent a car, " + name);
    } else {
      System.out.println("You can do pretty much anything, " + name);
    }
  }

}
