package ifstatements;

import java.util.Scanner;

public class SpaceBoxing {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    double weight;
    int numPlanet;

    Scanner keyboard = new Scanner(System.in);

    weight = inputWeight(keyboard);

    printQuestion();

    numPlanet = inputNumberPlanet(keyboard);

    printCosumption(weight, numPlanet);

  }

  private static void printCosumption(double weight, int numPlanet) {
    if (numPlanet == 1) {
      weight = weight * 0.78;
      System.out.println("Your weight would be " + weight + " pounds on Venus.");
    } else if (numPlanet == 2) {
      weight = weight * 0.39;
      System.out.println("Your weight would be " + weight + " pounds on Mars.");
    } else if (numPlanet == 3) {
      weight = weight * 2.65;
      System.out.println("Your weight would be " + weight + " pounds on Jupiter.");
    } else if (numPlanet == 4) {
      weight = weight * 1.17;
      System.out.println("Your weight would be " + weight + " pounds on Saturn.");
    } else if (numPlanet == 5) {
      weight = weight * 1.05;
      System.out.println("Your weight would be " + weight + " pounds on Uranus.");
    } else if (numPlanet == 6) {
      weight = weight * 1.23;
      System.out.println("Your weight would be " + weight + " pounds on Neptune.");
    }
  }

  private static int inputNumberPlanet(Scanner keyboard) {
    int numPlanet;
    System.out.print("Which planet are you visiting? ");
    numPlanet = keyboard.nextInt();
    keyboard.close();
    System.out.println();
    return numPlanet;
  }

  private static void printQuestion() {
    System.out.println("I have information for the following planets:");
    System.out.println("   1. Venus   2. Mars    3. Jupiter");
    System.out.println("   4. Saturn  5. Uranus  6. Neptune");
    System.out.println();
  }

  private static double inputWeight(Scanner keyboard) {
    double weight;
    System.out.print("Please enter your current earth weight: ");
    weight = keyboard.nextDouble();
    System.out.println();
    return weight;
  }

}
