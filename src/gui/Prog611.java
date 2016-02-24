package gui;

import javax.swing.JOptionPane;

public class Prog611 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String name = JOptionPane.showInputDialog("What is your name?");
    String input = JOptionPane.showInputDialog("How old are you?");
    int age = Integer.parseInt(input);

    System.out.println("Hello, " + name + ".");
    System.out.println("Next year you will be " + (age + 1) + ".");

    System.exit(0);
  }
}
