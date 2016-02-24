package variables;

public class MoreVariablesAndPrinting {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String name, eyes, teeth, hair;
    int age, height, weight;

    name = "Zed A. Shaw";
    age = 35; // not a lie
    height = 74; // inches
    weight = 180; // lbs
    eyes = "Blue";
    teeth = "White";
    hair = "Brown";

    print(name, eyes, teeth, hair, age, height, weight);

    double kilos = 9;
    double pounds = kilos * 2.20462;
    System.out.println("9 kilos = " + pounds + " pounds");
  }

  private static void print(String name, String eyes, String teeth, String hair, int age, int height, int weight) {
    System.out.println("Let's talk about " + name + ".");
    System.out.println("He's " + height + " inches tall.");
    System.out.println("He's " + weight + " pounds heavy.");
    System.out.println("Actually, that's not too heavy.");
    System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
    System.out.println("His teeth are usually " + teeth + " depending on the coffee.");
    System.out.println();
    System.out.println();
    // This line is tricky; try to get it exactly right.
    System.out.println("If I add " + age + ", " + height + ", and " + weight + " I get " + (age + height + weight) + ".");
  }

}
