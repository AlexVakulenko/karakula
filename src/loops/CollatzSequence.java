package loops;

import java.util.ArrayList;
import java.util.Scanner;

public class CollatzSequence {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int n;
    // int maxLenth = 20;
    Scanner scan = null;

    ArrayList<Integer> results = new ArrayList<>();

    scan = new Scanner(System.in);
    try {
      System.out.print("Starting number: ");
      n = scan.nextInt();

      do {
        if (n % 2 == 0) {
          n = n / 2;
        } else {
          n = 3 * n + 1;
        }

      } while (n != 1);

      // String fs = "\t" + n;

    } finally {
      scan.close();
    }
  }
}
