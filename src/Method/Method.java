package Method;

public class Method {
    public static void main(String[] args) {
        Method m = new Method();
        m.task();
    }
    public void task() {

        toDo();
        System.out.println("I am non task");
    }
    public void toDo() {
        toMake();
        System.out.println("I am toDo");
    }
    public static void toMake() {
        Method m = new Method();
        m.toEnd();
        System.out.println("I am Make");
    }
    public void toEnd() {
        System.out.println("End");
    }
}
