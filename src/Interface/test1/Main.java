package Interface.test1;

public class Main {
    public static void main(String[] args) {

    }
}
interface Z {
     void show();
}
interface Y extends X {
     void work();
}
interface X { //extends B Class // can't extend class
    void doIt();
}
class A implements Z,Y {

    @Override
    public void show() {
        System.out.println("A show");
    }

    @Override
    public void work() {
        System.out.println("Y work");
    }

    @Override
    public void doIt() {
        System.out.println("X doIt");
    }
}
class B {
    public void task() {
        System.out.println("B task");
    }
}
