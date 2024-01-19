package Protected;

public class Mama { // can't access protected class
    protected String name = "Su Su";
    public int age = 28;

//    protected Mama() { allow
//
//    }

    protected void task() {
        System.out.println("I am protected task");
    }
    public static void doIt() {
        System.out.println("I am public doIt");
    }
}
