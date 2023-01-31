
class Parent {
    int a=10;
    public int x,y;
     Parent(){
        System.out.println("Constructor of Parent");
    }
    Parent(int z){
         System.out.println("Parametrized Constructor of Parent\n" + z);
    }
    void setX(int X){
        this.x = X;
    }
    int GetX(){
        return x;
    }
    public void Print(){
         System.out.println("Print Parent");
    }
}
class Child extends Parent{
 int a =20;
    public int y;
     Child(){

     System.out.println("Constructor of child");
 }
    Child(int a, int b){
        super(100);
        System.out.println("Parametrized Constructor of Child");
    }
        /* Super() constructor key word used to run base class constructor other than default constructor from
         child class object.
         Super key word is also used to call methods and variables from Base class.
         if we use same parameters list as in base class methods and constructor then super key word will take
         values from child class constructor and assign to the parent constructor of same parameters and to functions.
         */
    void showA(){
        System.out.println(a);
        System.out.println(super.a);
    }
 void setY(int Y){
        this.y = Y;
 }
 int getY(){
        return y;
 }
 public void Print(){
        System.out.println("Print Child");
 }
}
public class Main {
    public static void main(String[] args) {

        /*System.out.println("Hello world!");
        Parent object = new Parent(15);
        object.setX(5);
        System.out.println(object.GetX());
        System.out.println("The following is child class objects");
        Child cObject = new Child();
        cObject.setX(15);
        cObject.setY(10);
        System.out.println(cObject.GetX());
        System.out.println(cObject.getY());
        cObject.showA(); */
        Parent object = new Child();
        object.Print();

    }
}