package keyinput;

import java.util.Scanner;

public class UserInput {

  static String nameF;
  static String nameL;
  static int grade;
  static int id;
  static String login;
  static double gpa;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);

    inputPart1(keyboard);

    inputPart2(keyboard);

    inputPart3(keyboard);

    inputPart4(keyboard);

    printSummary();

  }

  private static void printSummary() {
    System.out.println("Your information:");
    System.out.println("     Login:      " + login);
    System.out.println("     ID:         " + id);
    System.out.println("     Name:       " + nameL + ", " + nameF);
    System.out.println("     GPA:        " + gpa);
    System.out.println("     Grade:      " + grade);
  }

  private static void inputPart4(Scanner keyboard) {
    System.out.print("GPA (0.0-4.0): ");
    gpa = keyboard.nextDouble();

    keyboard.close();
  }

  private static void inputPart3(Scanner keyboard) {
    System.out.print("Student ID: ");
    id = keyboard.nextInt();

    System.out.print("Login: ");
    login = keyboard.next();
  }

  private static void inputPart2(Scanner keyboard) {
    System.out.print("Grade (9-12): ");
    grade = keyboard.nextInt();
    while (grade > 12 | grade < 9) {
      System.out.print("Your grade should be between 9 and 12. Try again..");
      grade = keyboard.nextInt();

    }

  }

  private static void inputPart1(Scanner keyboard) {
    System.out.println("Please enter the following information so I can sell it for a profit!");

    System.out.print("First name: ");
    nameF = keyboard.next();

    System.out.print("Last name:");
    nameL = keyboard.next();
  }
}
