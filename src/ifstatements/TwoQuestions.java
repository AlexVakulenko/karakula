package ifstatements;

import java.util.Scanner;

public class TwoQuestions {

  String answer1;
  String answer2;
  String result = "test";

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    TwoQuestions tq = new TwoQuestions();

    tq.inputData();

    tq.answerGenerator();

    tq.printResult();

  }

  void printResult() {
    // System.out.println(answer1 + "  " + answer2 + "  " + result);
    System.out.println("My guess is that you are thinking of a " + result + ".");
    System.out.println("I would ask you if I'm right, but I don't actually care.");
  }

  void inputData() {
    System.out.println("TWO QUESTIONS!");
    System.out.println("Think of an object, and I'll try to guess it.");
    System.out.println();
    System.out.println("Question 1) Is it animal, vegetable, or mineral?");

    Scanner keyboard = new Scanner(System.in);
    System.out.print(">>>");
    answer1 = keyboard.next();
    System.out.println();
    System.out.println("Question 2) Is it bigger than a breadbox?");
    System.out.print(">>>");
    answer2 = keyboard.next();
    keyboard.close();
  }

  void answerGenerator() {
    if (answer2.equals("no")) {
      variantA();

    } else if (answer2.equals("yes")) {
      variantB();

    }

  }

  String variantA() {
    if (answer1.equals("animal")) {
      result = "squirel";
    } else if (answer1.equals("vegetable")) {
      result = "carrot";
    } else if (answer1.equals("mineral")) {
      result = "paper clip";
    }
    return result;
  }

  String variantB() {
    if (answer1.equals("animal")) {
      result = "moose";
    } else if (answer1.equals("vegetable")) {
      result = "watermelon";
    } else if (answer1.equals("mineral")) {
      result = "Camaro car";

    }
    return result;
  }

  // Map<String, String> vAMap = new HashMap<String, String>() {
  // {
  // put("key1", "value1");
  // }
  // };
}
