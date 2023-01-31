interface Interface1{
void meth1();
void meth2();
default void meth3(){System.out.println("This is default method interface");}
}
interface interface2 extends Interface1{ // Interface2 inherits Interface1
    void meth4();
    void meth5();
}
class Myclass implements interface2{
    void SetX(){
        System.out.println("This is X");
    }
    @Override
    public void meth1() {System.out.println("Method1");}

    @Override
    public void meth2() {System.out.println("Method2");}

    @Override
    public void meth3() {System.out.println("Method3");}

    @Override
    public void meth4() {System.out.println("Method4");}

    @Override
    public void meth5() {System.out.println("Method5");}
}
public class Interface_inheritance {
    public static void main(String[] args) {
        Interface1 object2 = new Myclass();
        object2.meth1();
        object2.meth3();
        ////////////////////////////////
        interface2 object = new Myclass();
    //  object.SetX(); This function cannot be implemented using reference of interface2, As this is method of Myclass.
        object.meth1();
        object.meth5();
        /////////////////////////////////
         Myclass object1 = new Myclass();
         object1.SetX();
    }
}
