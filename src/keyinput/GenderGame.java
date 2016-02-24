package keyinput;

import java.util.Scanner;

public class GenderGame {

  static String gender;
  static String nameF;
  static String nameL;
  static int age;
  static String prefix;
  static String status;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = null;
    scan = new Scanner(System.in);

    try {
      inputData(scan);
      chooseGender(scan);

    } finally {
      scan.close();
    }

  }

  private static void chooseGender(Scanner scan) {
    if (gender.equals("F")) {

      resultFemale(scan);

    } else if (gender.equals("M")) {

      resultMale();

    }
  }

  private static void resultFemale(Scanner scan) {
    if (age < 20) {
      System.out.println("Then I shall call you, " + nameF + " " + nameL + ".");
    } else {

      askStatus(scan);

      choosePrefix();

      System.out.println("Then I shall call you, " + prefix + " " + nameL + ".");
    }
  }

  private static void resultMale() {
    if (age < 20) {
      System.out.println("Then I shall call you, " + nameF + " " + nameL + ".");
    } else {
      System.out.println("Then I shall call you, " + "Mr. " + nameL + ".");
    }
  }

  private static void inputData(Scanner scan) {
    System.out.print("What is your gender (M or F): ");
    gender = scan.next();
    System.out.print("First name: ");
    nameF = scan.next();
    System.out.print("Last name: ");
    nameL = scan.next();
    System.out.print("Age: ");
    age = scan.nextInt();
  }

  private static void choosePrefix() {
    if (status.equals("yes")) {
      prefix = "Mrs";
    } else if (status.equals("no")) {
      prefix = "Ms";
    }
  }

  private static void askStatus(Scanner scan) {
    System.out.print("Are you married, " + "(yes or no)? >>>");
    status = scan.next();
  }
}