package Interface.functional_interface;

public class Fun_Interface {
    public static void main(String[] args) {
        X obj1 = new X() {
            @Override
            public void run() {
                System.out.println("Hello X");
            }
        };
        Y obj2 = () -> System.out.println("Hello Y");
        obj1.run();
        obj2.run();
    }
}
@FunctionalInterface
interface X {
     void run();
}
@FunctionalInterface
interface Y {
     void run();
}
