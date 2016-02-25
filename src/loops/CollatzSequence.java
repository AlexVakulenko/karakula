package loops;

import java.util.ArrayList;

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
         results.add(n);
         
      } while (n != 1);
      
   

    } finally {
      scan.close();
    }
    int resultCount=results.size();
    int biggestNumber=0;

  
    for (int i=0; i<resultCount; i++){
        System.out.println("Result #" + i + " is "
            + results.get(i));
        
        if (results.get(i) > biggestNumber) {
			biggestNumber=results.get(i);
		}    
    }
    System.out.println("You have "+ resultCount+" results");
    System.out.println("Biggest number is "+biggestNumber);

  }
}
