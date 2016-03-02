package loops;

import java.util.HashMap;
import java.util.Scanner;

public class NimVersion2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int howManyPlayers;

    // String username;
    Scanner keyboard = null;
    char pileA = 'A';
    char pileB = 'B';
    char pileC = 'C';
    char pile;
    String keyA;
    String keyB;
    String keyC;
    int remove;
    int result;
    keyboard = new Scanner(System.in);

    // enter players quantity
    System.out.print("How many players do you want? >>>");
    howManyPlayers = keyboard.nextInt();

    // create array for players names and HashMap for pairs key/value
    String[] users = new String[howManyPlayers];
    HashMap<String, Integer> pMap = new HashMap<>();

    // fill up array for players objects
    for (int i = 0; i < howManyPlayers; i++) {
      System.out.print("Player " + (i + 1) + " enter your name: ");
      users[i] = keyboard.next();
      pMap.put(users[i] + pileA, 3);
      pMap.put(users[i] + pileB, 4);
      pMap.put(users[i] + pileC, 5);
    }

    // print HashMap contains
    // System.out.println(Collections.singletonList(pMap));
    System.out.println("A: " + pMap.get(users[0]+pileA) + " B: " + pMap.get(users[0]+pileB) 
    		+ " C: " + pMap.get(users[0]+pileC));

    for (int i = 0; i < users.length; i++) {
      keyA = users[i] + pileA;
      keyB = users[i] + pileB;
      keyC = users[i] + pileC;
      System.out.print(users[i] + "choose a pile:");
      pile = keyboard.next().charAt(0);
      System.out.print("How many to remove from pile " + pile);
      remove = keyboard.nextInt();

      if (pile == pileA) {
        result = pMap.get(keyA) - remove;
        pMap.put(keyA, result);
      } else if (pile == pileB) {
        result = pMap.get(keyB) - remove;
        pMap.put(keyB, result);
      } else if (pile == pileC) {
        result = pMap.get(keyC) - remove;
        pMap.put(keyC, result);
      }
      System.out.println("A: " + pMap.get(keyA) + " B: " + pMap.get(keyB) + " C: " + pMap.get(keyC));
    }
  }

}
