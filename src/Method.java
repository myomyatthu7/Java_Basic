public class Method {
    public static void main(String[] args) {
        Method m = new Method();
        m.task1();
        if (task3()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(task4(5));
    }
    public void task1() {
        task2();
        System.out.println("I am non_static. ");
    }
    public static void task2() {
        System.out.println("I am static");
    }
    public static boolean task3() {
        return false;
    }
    public static int task4(int num) {
        return num;
    }
}
