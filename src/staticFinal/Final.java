package staticFinal;

// final variable -> can't reassign,
// final method -> can't overriding from child class;
// final Class -> can't inheritance
public class Final extends Robot { // cannot inheritance final class

    // cannot override because of final
    //@Override
//    public void task() {
//        System.out.println("Robot is speaking");
//    }

    public static void main(String[] args) {
       Final fi = new Final();
       fi.task(2);
    }
}
 class Robot {

    final String text; // can be assigned in constructor
     static final String str; // can be assigned in static block;

     private static final String  USER_NAME = "Mg Mg"; // unchangeable , no need obj to call; // should use capital latter;
    public Robot() {
        text = "Mg Mg";
    }
    static {
        str = "Hello";
    }

     final public String name = "Aex";
    final public void task( int id) {
        //id = 2; // final parameter cannot reassign value;
      //  name = "Ella"; cannot assign
        System.out.println("Robot is walking");
    }
}
