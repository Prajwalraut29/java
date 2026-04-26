
// encapsulation 
public class demo {

  public static void main(String[] args) {
        Car car = new ElectricCar();
        car.start();
        car.accelarate();
      
  }

}

abstract class Car {
void start() {
    System.out.println("car is starting");
  }
  abstract void accelarate();

//  abstract void breake();
}


class FuelCar extends Car {
  
  @Override
  void accelarate() {
    System.out.println("fuel car is accelarating");
  }

}


class ElectricCar extends Car {
  @Override
     void accelarate() {
    System.out.println("electric car is accelarating");
  }
}











// class BankAccount {
//   private double balance;
//    // setter
//   public void deposit(int amount) {
//     balance += amount;
//   }
//       // getter 
//   public void withdraw(int amount) {
//     balance -= amount;
//   }

//   public double getBalance(){
//      return balance;
//   }
// }

/*  class Student 
   private String name;
   private int age;
   private String collage;
   

     Student(String name , int age , String collage ){
      this.name = name;
      this.age = age;
      this.collage = collage;
     }

    public String getName() {
      return name;
    }
     
    public void setname(String name ){
      this.name = name;
    }

    public String getCollage(){
      return collage;
    }
      
    public void SetCollage(String collage ){
      this.collage = collage;
    }


    
    

}

*/