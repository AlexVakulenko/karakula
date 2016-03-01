package loops;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Nim {

  static int A;
  static int B;
  static int C;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int howManyPlayers;

    String username;
    Scanner keyboard = null;
    char pile;
    int remove;
    keyboard = new Scanner(System.in);

    // enter players quantity
    System.out.print("How many players do you want? >>>");
    howManyPlayers = keyboard.nextInt();

    PlayerNim[] units = new PlayerNim[howManyPlayers];
    HashMap<String, Object> pMap = new HashMap<>();

    // fill up array for players objects
    for (int i = 0; i < howManyPlayers; i++) {
      System.out.print("Player " + (i + 1) + " enter your name: ");
      username = keyboard.next();
      units[i] = new PlayerNim();
      pMap.put(username, units[i]);

    }
    // print players map size and
    int checkMap = pMap.size();
    System.out.println(checkMap);

    for (Entry<String, Object> entry : pMap.entrySet()) {

      String key = entry.getKey().toString();
      PlayerNim value = (PlayerNim) entry.getValue();
      A = value.A;
      B = value.B;
      C = value.C;
      System.out.println("key, " + key + ", value A " + A + " value B " + B + " value C " + C);
      // create player instance

    }
    do {

      for (int i = 0; i < units.length; i++) {
        System.out.print(units[i] + " choose a pile: ");
        pile = keyboard.next().charAt(0);
        System.out.print("How many to remove from pile " + pile);
        remove = keyboard.nextInt();

        PlayerNim currentPlayer = (PlayerNim) pMap.get(units[i]);
        if (pile == 'A') {
          currentPlayer.A = currentPlayer.A - remove;
        } else if (pile == 'B') {
          currentPlayer.B = currentPlayer.B - remove;
        } else if (pile == 'C') {
          currentPlayer.C = currentPlayer.C - remove;
        }
        A = currentPlayer.A;
        B = currentPlayer.B;
        C = currentPlayer.C;
        System.out.println("A " + A + "B " + B + "C " + C);
      }

    } while (A > 0 | B > 0 | C > 0);

  }
}