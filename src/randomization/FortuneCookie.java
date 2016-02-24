package randomization;

import java.util.Random;

public class FortuneCookie {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Random r = null;
    r = new Random();

    fortuneGenerator(r);
    lottoGenerator(r);

  }

  private static void fortuneGenerator(Random r) {

    int i = 1 + r.nextInt(6);
    String responce;

    if (i == 1) {
      responce = "You will find happiness with a new love.";
    } else if (i == 2) {
      responce = "Stick with your wife.";
    } else if (i == 3) {
      responce = "case 3";
    } else if (i == 4) {
      responce = "case 4";
    } else if (i == 5) {
      responce = "case 5";
    } else if (i == 6) {
      responce = "case 6";
    } else {
      responce = "ERROR FORTUNE";
    }
    System.out.println("Fortune cookie says: " + "\"" + responce + "\"");
  }

  private static void lottoGenerator(Random r) {
    int lotto1 = 1 + r.nextInt(54);
    int lotto2 = 1 + r.nextInt(54);
    int lotto3 = 1 + r.nextInt(54);
    int lotto4 = 1 + r.nextInt(54);
    int lotto5 = 1 + r.nextInt(54);
    int lotto6 = 1 + r.nextInt(54);
    System.out.println(lotto1 + "-" + lotto2 + "-" + lotto3 + "-" + lotto4 + "-" + lotto5 + "-" + lotto6);
  }
}
