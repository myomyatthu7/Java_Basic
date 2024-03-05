package java_update;

// java 17
public class MySealed { // often use in payment gate.
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();
        B obj2 = new B();
        obj2.show();
    }
}
sealed class A permits B,C,D {
    void show() {
        System.out.println("A Show");
    }
}
non-sealed class B extends A { // can be parent or not.
    void show() {
        //super.show();
        System.out.println("B Show");
    }
}
sealed class C extends A permits E { // sealed class must have child.

}
final class D extends A { // must not have subclass.

}
final class E extends C {  // can't extends A (not permits).
//
}