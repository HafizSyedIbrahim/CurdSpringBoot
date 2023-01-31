class A {
    A() {

    }
    public void Show() {
        System.out.println("Print Method of A");
    }

    public void Method1() {
        System.out.println("Method 1 of class A");
    }
}
class B extends A{
    B(){

    }
    public void Method(){
        System.out.println("I am Class B Method");
    }
    public void Method1(){
        System.out.println("Method1 of class B");
    }
}

public class Java_MethodOverriding {
    public static void main(String[] args) {
        A object = new A();
        object.Method1();
        B object1 = new B();
        object1.Method1();
    }
}
