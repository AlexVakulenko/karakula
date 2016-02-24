package ifstatements;

import java.util.Scanner;

public class Adventure1 {

  //
  String answer;

  public void setAnswer() {

    Scanner keyboard = new Scanner(System.in);
    System.out.print("enter your answer >>>");
    extracted(keyboard);
    keyboard.close();

  }

  private void extracted(Scanner keyboard) {
    keyboard.next();
  }

  //
  //
  private void room1() {
    if (answer.equals("kitchen")) {
      System.out.println("There is a long countertop with dirty dishes everywhere. "
          + " Off to one sidethere is, as you\'d expect, a refrigerator. " + "You may open the \"refrigerator\"or look in a \"cabinet\"");

      setAnswer();
      room2();
    } else if (answer.equals("upstairs")) {
      System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\"bedroom\". "
          + " There is also a \"bathroom\" off the hallway.  Where would you liketo go?");
      setAnswer();
      room3();
    }
  }

  private void room2() {
    if (answer.equals("cabinet")) {
      System.out.println("there is a dark gloomy cabinrt with a dusty skeleton in the corner."
          + "Do you want take cranium in your hand? \"yes\" or \"no\" ???");
      setAnswer();
      room4();
    } else if (answer.equals("frige")) {
      System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty. "
          + "Would you like to eat some of the food? (\"yes\" or \"no\")");
      setAnswer();
      room5();
    }
  }

  private void room3() {
    if (answer.equals("bedroom")) {
      System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  "
          + "Thebed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\")");
      setAnswer();
      room6();
    } else if (answer.equals("bathroom")) {
      System.out.println("Now you are in bathroom. do you want take a shower? (\"yes\" or \"no\")");
      setAnswer();
      room7();
    }
  }

  private void room4() {
    if (answer.equals("yes")) {
      event1();
    } else if (answer.equals("no")) {
      event2();
    }
  }

  private void room5() {
    if (answer.equals("yes")) {
      event3();
    } else if (answer.equals("no")) {
      event4();
    }
  }

  private void room6() {
    if (answer.equals("yes")) {
      event5();
    } else if (answer.equals("no")) {
      event6();
    }
  }

  private void room7() {
    if (answer.equals("yes")) {
      event7();
    } else if (answer.equals("no")) {
      event8();
    }
  }

  private void event1() {
    System.out.println("You are looks like Hamlet, CHEERS!!!");
  }

  private void event2() {
    System.out.println("It's good choice, because insaid cranium lives the snake %)");
  }

  private void event3() {
    System.out.println("Oh, Good!!! You can live here!!!");
  }

  private void event4() {
    System.out.println("You die of starvation... eventually.");
  }

  private void event5() {
    System.out.println("AAAAAAAAA!!!!!!! A CROCODILE INSIDE!!!!");
  }

  private void event6() {
    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing, "
        + "I'm tired of making nested if statements.");
  }

  private void event7() {
    System.out.println("Very hot water, be careful!");

  }

  private void event8() {
    System.out.println("You can brush your teeth, finally..");
  }

  private void start() {
    System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
    System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\"kitchen\"?");
    setAnswer();
    System.out.println(answer + "OOO");
    room1();

  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Adventure1 adv = new Adventure1();
    adv.start();
  }
}
