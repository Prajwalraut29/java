
// encapsulation 
public class demo {

  public static void main(String[] args) {
      Splender sp = new Splender();

      // sp.Start(); // parent class method
      // sp.SelfStart(); // child class method
        Vehicle v = new Vehicle();
        // v.Start(); // parent class method
        //  v.SelfStart(); // child class method not accessible
      
  }

}

 class Vehicle  {
    public void Start(){
      System.out.println("Vehicle is starting");
    }
}

class Splender extends Vehicle {

    public void SelfStart(){
      System.out.println("Splender is self starting");
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