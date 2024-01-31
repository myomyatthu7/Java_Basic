package polymorphism;

public class Test {
    public static void main(String[] args) {
        C c = new C();
        //A a = new C();
        //a.showName();
      //  C c1 = new A(); can't create obj
        A a = new C();
      //  a.showAge(); can't call.
        B b = new C();
        b.showName();
        c.showName();
        c.showAge();
        System.out.println("+++++++++++++++++++++++++++++");

        // polymorphism -> Dynamic Method Dispatch -> compile time
       // Computer computer = new Laptop(); // Example
       X x = new X();
       x = new Y();
       x.showName();
       // x.showAge(); // can't call

       x = new Z();
       x.showName();

    }
}
class X {
    public void showName() {
        System.out.println("X name");
    }
}
class Y extends X{
    public void showAge() {
        System.out.println("Y age");
    }
}
class Z extends X {
    public void showInfo() {
        System.out.println("Z info");
    }
}

class A {
    public void showName() {
        System.out.println("A name");
    }
}
class B extends A {
    public void showAge() {
        System.out.println("B age");
    }
    public void showName() {
        System.out.println("B name");
    }
}
class C extends B {

}