package keyinput;

import java.util.Scanner;

public class QuestionMashine {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String name;
    int age;
    double salary;

    System.out.print("Hello.  What is your name?");
    name = keyboard.next();

    System.out.print("Hi," + name + " How old are you?");
    age = keyboard.nextInt();

    System.out.print("So you're " + age + ", eh?  That's not old at all! How much do you make, " + name + "?");
    salary = keyboard.nextDouble();

    System.out.println(salary + "!  I hope that's per hour and not per year! LOL!");
    keyboard.close();

  }
}