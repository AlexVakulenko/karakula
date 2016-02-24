package basic;

public class NumbersAndMath {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int a = 10;
    int b = 20;
    int c = 25;
    System.out.println("b / a = " + (b / a));
    System.out.println("b % a = " + (b % a));
    System.out.println("c % a = " + (c % a));

    System.out.println("I will now count my chickens:");

    System.out.println("Hens " + (7.0 / 4.0));
    System.out.println("Roosters " + (7 / 4));

    System.out.println("Now I will count the eggs:");

    System.out.println(3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6);

    System.out.println("Is it true that 3 + 2 < 5 - 7?");

    System.out.println(3 + 2 < 5 - 7);

    System.out.println("What is 3 + 2? " + (3 + 2));
    System.out.println("What is 5 - 7? " + (5 - 7));

    System.out.println("Oh, that's why it's false.");

    System.out.println("How about some more.");

    System.out.println("Is it greater? " + (5 > -2));
    System.out.println("Is it greater or equal? " + (5 >= -2));
    System.out.println("Is it less or equal? " + (5 <= -2));
  }
}
