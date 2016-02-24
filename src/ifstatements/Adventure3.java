package ifstatements;

import java.util.Scanner;

public class Adventure3 {

  //
  String answer;

  private void roomm7() {
    if (answer.equals("yes")) {
      System.out.println("Very hot water, be careful!");
    } else if (answer.equals("no")) {
      System.out.println("You can brush your teeth, finally..");
    }
  }

  private void roomm6() {
    if (answer.equals("yes")) {
      System.out.println("AAAAAAAAA!!!!!!! A CROCODILE INSIDE!!!!");
    } else if (answer.equals("no")) {
      System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing, "
          + "I'm tired of making nested if statements.");

    }
  }

  private void roomm4() {
    if (answer.equals("yes")) {
      System.out.println("You are looks like Hamlet, CHEERS!!!");
    } else if (answer.equals("no")) {
      System.out.println("It's good choice, because insaid cranium lives the snake %)");
    }
  }

  private void roomm5() {
    if (answer.equals("yes")) {
      System.out.println("Oh, Good!!! You can live here!!!");
    } else if (answer.equals("no")) {
      System.out.println("You die of starvation... eventually.");
    }
  }

  private void roomm3() {
    if (answer.equals("bedroom")) {
      System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  "
          + "Thebed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\")");
      inputData();
      roomm6();

    } else if (answer.equals("bathroom")) {
      System.out.println("Now you are in bathroom. do you want take a shower? (\"yes\" or \"no\")");
      inputData();
      roomm7();
    }
  }

  private void roomm2() {
    if (answer.equals("cabinet")) {
      System.out.println("there is a dark gloomy cabinrt with a dusty skeleton in the corner."
          + "Do you want take cranium in your hand? \"yes\" or \"no\" ???");
      inputData();
      roomm4();

    } else if (answer.equals("refrigerator")) {
      System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty. "
          + "Would you like to eat some of the food? (\"yes\" or \"no\")");
      inputData();
      roomm5();
    }
  }

  private void inputData() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("enter your answer >>>");
    answer = keyboard.next();
    // keyboard.close();
  }

  private void roomm1() {
    if (answer.equals("kitchen")) {
      System.out.println("There is a long countertop with dirty dishes everywhere. "
          + " Off to one sidethere is, as you\'d expect, a refrigerator. " + "You may open the \"refrigerator\"or look in a \"cabinet\"");
      inputData();
      roomm2();

    } else if (answer.equals("upstairs")) {
      System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\"bedroom\". "
          + " There is also a \"bathroom\" off the hallway.  Where would you liketo go?");
      inputData();

      roomm3();

    }
  }

  private void start() {
    System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
    System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\"kitchen\"?");
    inputData();
    System.out.println(answer + "test");
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Adventure3 dv = new Adventure3();

    dv.start();

    dv.roomm1();

  }

}
