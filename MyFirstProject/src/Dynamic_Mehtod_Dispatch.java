class Phone{
    Phone(){
        System.out.println("The Default Constructor of Phone");
    }
    Phone(int a, int b){
        System.out.println("The Parametrized Constructor of Phone");
    }
    public void Ringing(){
        System.out.println("Phone is ringing");
    }
    public void On(){
        System.out.println("Phone is ON...");
    }
}
class SmartPhone extends Phone{
    SmartPhone(){
        System.out.println("The Default constructor of SmartPhone");
    }
    SmartPhone(int c, int d){
        super(10,11); // By using Keyword the parametrized constructor of Baseclass will run when object of derived class is made.
        System.out.println("The Parametrized constructor of SmartPhone");
    }
    public void On(){
        System.out.println("Smart Phone is ON....");
    }
    public void music(){
        System.out.println("Smart Phone Playing Music");
    }
}
public class Dynamic_Mehtod_Dispatch {
    public static void main(String[] args) {
        Phone object = new SmartPhone(12,12); // this is called Dynamic Method Dispatch. this is also used for method overriding.
        object.On();

    }
}
