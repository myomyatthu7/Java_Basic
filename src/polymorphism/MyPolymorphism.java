package polymorphism;

public class MyPolymorphism {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        Machine m2 = new Phone();
        Machine m3 = new Car();
       // m2.start();
        doIt(m3);
    }
    public static void doIt(Machine m) {
        m.start();
    }
}
class Machine {
    public void start() {
        System.out.println("Machine is starting");
    }
}
class Phone extends Machine {
    @Override
    public void start() {
        System.out.println("Phone is starting");
    }
}
class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}