
interface Bicycle{
    int speed =0, brake=0;
     void Setspeed(int Speed);
     void brake(int Brake);
     default void RunBicycle(){ // Default Method is implemented in all Classes by default which implement this interface.
         System.out.println("Bicycle is running");
     }

}
interface Tricycle{
    void setThreeWheels();
    void setDesign();
}
class BMX implements Bicycle, Tricycle{ // Multiple interfaces can be implemented in a class unlike a class
    // which can only be inherited  once.
    int run;
    int stop;
    public void Setspeed (int Speed){
        // speed = Speed; This will show error as values cannot be assigned to data members of interfaces.
        run = Speed;
        System.out.println(run);
    }
    public void brake(int Brake){
        stop = run - Brake;
        System.out.println(stop);
    }
    public void setThreeWheels(){
        System.out.println("Wheels of Tricycle are Three");
    }
    public void setDesign(){
        System.out.println("Design of Tricycle is appealing");
    }
}
public class Interfaces_Java {
    public static void main(String[] args) {
      BMX object = new BMX();
      object.Setspeed(12);
      object.brake(5);
      object.setThreeWheels();
      object.setDesign();
      object.RunBicycle();
      ////////////////////
        Bicycle object1 = new BMX();
      // Here object of interface cannot be made but reference of Interface can be used, as mentioned above.
      // It will run its methods and override methods of a class which implements such interface.
    }
}
