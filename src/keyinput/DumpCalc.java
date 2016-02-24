package keyinput;

import java.util.Scanner;

public class DumpCalc {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    double first;
    double second;
    double third;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is your first number? ");
    first = keyboard.nextDouble();

    System.out.print("What is your second number? ");
    second = keyboard.nextDouble();

    System.out.print("What is your third number? ");
    third = keyboard.nextDouble();

    keyboard.close();
    System.out.println((first + " + " + second + " + " + third) + "/ 2 is..." + ((first + second + third) / 2));

  }
}
