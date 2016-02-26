package loops;

import java.util.Scanner;

public class BabyNim {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int A = 3;
    int B = 3;
    int C = 3;

    String pile;

    int picker;
    System.out.println("A: " + A + "    B: " + B + "    C: " + C);

    Scanner s = null;
    try {
      s = new Scanner(System.in);

      do {
        System.out.print("Choose a pile: ");
        pile = s.next();
        System.out.println("How many to remove from pile " + pile + ":");
        picker = s.nextInt();
        if (pile.equals("A")) {
          A = A - picker;
        } else if (pile.equals("B")) {
          B = B - picker;
        } else if (pile.equals("C")) {
          C = C - picker;
        }
        System.out.println("A: " + A + "    B: " + B + "    C: " + C);
      } while (A > 0 | B > 0 | C > 0);
    } finally {
      s.close();
    }
    System.out.println("All piles are empty. Good job!");
  }

}
