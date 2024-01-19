package Class;

public class Square {
    public int heightNonStatic;
    public static int widthStatic;
    public static void taskStatic() {
        System.out.println("I am square task");
    }
    public String taskNonStatic(String name) {
        return "Hello "+name+" width is "+ widthStatic;
    }

    // Methods overloading
    public void task(String name) {
        System.out.println("Name is " +name);
    }
    public void task(String name,int age) {
        System.out.println("Name is "+name+ " Age is "+age);
    }
}
