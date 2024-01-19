package Method;

public class Return {
    public static void main(String[] args) {
        System.out.println(task());
        if (toDo()) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
        System.out.println(para("Mg Mg",20));
    }
    public static String task() {
        return "Task";
    }
    public static boolean toDo() {

        return true;
    }
    public static String para(String name,int age) {
        return "Name is "+name + " Age is "+age;
    }
}
