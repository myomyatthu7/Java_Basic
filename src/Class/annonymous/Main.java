package Class.annonymous;

public class Main {
    public static void main(String[] args) {
        new A(); // anonymous obj;
        A a = new A();
        a.i = 50;
        //new A().show();

    }
}
class A {
    int i = 45;
    public A() {
        System.out.println("Constructor Created");
    }
    public void show() {
        System.out.println("Show Method");
    }
}
