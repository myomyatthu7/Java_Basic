package inner;

public class LocalInner {
    public static void main(String[] args) {
        Machines machines = new Machines();
        machines.start();
    }
}
class Machines {
        String name = "Machine";
        public void start() {
            System.out.println(name+" is working");

            class Phone { // static class not allow
                static final String appName = "Camera";
                public static void snap() {
                    System.out.println(appName+" is working");
                }
            }
//            Phone phone = new Phone();
//            phone.snap();
            Phone.snap();
        }
}
