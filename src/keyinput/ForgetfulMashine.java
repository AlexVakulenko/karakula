package keyinput;

import java.util.Scanner;

public class ForgetfulMashine {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Give me a word!");
    keyboard.next();
    System.out.print("Give me a second word!");
    keyboard.next();
    System.out.print("Great, now your favorite number?");
    keyboard.next();
    keyboard.close();

  }
}
