abstract class Car{ // Abstract class only define its methods prototype. Method implementation is provided in its inherited class.
    Car(){
        System.out.println("Constructor of Car");
    }
    public void CarDetails(){
        System.out.println("Car is extended form of Bike");
    }
    abstract public void horn();
    abstract public void CarModel();
}
class Ford extends Car{
    Ford(){
        System.out.println("Constructor of Ford");
    }
    @Override
    public void horn() {
        System.out.println("The Horn of Ford is amazing");
    }

    @Override
    public void CarModel() {
        System.out.println("The Model of this Car is Ford");
    }
    public void FordModel(){
        System.out.println("The Ford Model is latest one");
    }
}

public class Abstract_Class_Java {
    public static void main(String[] args) {
        Car object = new Ford(); // Reference of Car Class is used and object of Ford class is made.
        object.CarModel();
        object.horn();
        object.CarDetails();
        /* object.FordModel(); -- This will show error. As reference object of parent class only runs override methods
         and methods which exists only in Parent Class.
          */

    }

}
