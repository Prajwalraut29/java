public class demo4 {
    public static void main(String[] args) {
        car car = new fuelCar();
        car.start();
        car.accelarate();
    }
}

interface car {
    void start();
    void accelarate();

}

class fuelCar implements car {
  @Override
  public void start() {
    System.out.println("car is starting");
  }

  @Override
  public void accelarate() {
    System.out.println("fuel car is accelarating");
  }
  
}


// abstraction using interface