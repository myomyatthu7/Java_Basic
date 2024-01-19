package staticFinal;

import java.awt.*;

public class Static {
    static {
        System.out.println("I am static block");
    }
    public static void main(String[] args) {
        Test.task();
    }
}
class Test {
    static {
        System.out.println("I am Test static block");
    }
    static String name = "Mg Mg";
    public static void task() {
        System.out.println("Name is "+name);
    }
    public void doIt() {
        System.out.println("Name is "+name);
    }
}
