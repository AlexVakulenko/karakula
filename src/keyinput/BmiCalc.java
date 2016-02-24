package keyinput;

import java.util.Scanner;

public class BmiCalc {

  static int weight;
  static double height;
  static String condition;
  static double result;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);

    inputData(keyboard);

    calculateResult();
    System.out.println("Your BMI is" + result);
    defineCondition();

    System.out.println("BMI Category: " + condition);
  }

  private static double calculateResult() {
    return result = weight / (Math.pow(height, 2));
  }

  private static String defineCondition() {
    if (result < 18.5) {
      condition = "underweight";
    } else if (result >= 18.5 && result <= 24.9) {
      condition = "normal weight";
    } else if (result > 24.9 && result <= 29.9) {
      condition = "overweight";
    } else {
      condition = "obese";
    }
    return condition;
  }

  private static void inputData(Scanner keyboard) {
    System.out.print("Your height in METERS: ");
    height = keyboard.nextDouble();

    System.out.print("Your weight in KG: ");
    weight = keyboard.nextInt();
    keyboard.close();
  }
}
