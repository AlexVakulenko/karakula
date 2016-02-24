package keyinput;

import java.util.Scanner;

public class AskingQuestions {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);

    int age;
    int heightI;
    int heightF;
    double weight;

    System.out.print("How old are you? ");
    age = keyboard.nextInt();

    System.out.print("How many feets are you? ");
    heightF = keyboard.nextInt();

    System.out.print("How many inches are you? ");
    heightI = keyboard.nextInt();

    System.out.print("How mutch do you weight? ");
    weight = keyboard.nextDouble();

    System.out.println("So you're " + age + " old, " + heightF + "'" + heightI + "''" + " tall and " + weight + " heavy.");
    keyboard.close();
  }
}
