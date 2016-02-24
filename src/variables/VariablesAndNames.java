package variables;

public class VariablesAndNames {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int cars, drivers, passengers, carsNotDriven, carsDriven;
    double spaceInCar, carpoolCapacity, averagePassengersPerCar;

    cars = 100;
    spaceInCar = 4.0;
    drivers = 30;
    passengers = 90;
    carsNotDriven = cars - drivers;
    carsDriven = drivers;
    carpoolCapacity = carsDriven * spaceInCar;
    averagePassengersPerCar = passengers / carsDriven;

    System.out.println("There are " + cars + " cars available.");
    System.out.println("There are only " + drivers + " drivers available.");
    System.out.println("There will be " + carsNotDriven + " empty cars today.");
    System.out.println("We can transport " + carpoolCapacity + " people today.");
    System.out.println("We have " + passengers + " to carpool today.");
    System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
  }

}
